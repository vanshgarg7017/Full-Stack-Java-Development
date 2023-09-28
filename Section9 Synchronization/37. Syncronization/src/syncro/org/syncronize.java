package syncro.org;
class sync{
	 synchronized public void generate() {
		for(int i=1;i<=10;i++) {
			if(i<=5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}
public class syncronize {
	public static void main(String[] args) {
		sync sy1=new sync();
		sync sy2=new sync();
		new Thread(new Runnable(){
			public void run() {
				for(int i=1;i<=5;i++) {
					sy1.generate();
					}
				}
		}).start();
		new Thread(new Runnable(){
			public void run() {
				for(int i=1;i<=5;i++) {
					sy2.generate();
					}
				}
		}).start();
	}
}
