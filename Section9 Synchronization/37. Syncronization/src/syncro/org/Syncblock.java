package syncro.org;
class sync1{
	private Object lock="lock";
	 public void generate() {
		 synchronized(lock){
		 try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		for(int j=0;j<=10;j++) {
			 try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	 
}
public class Syncblock {
	public static void main(String[] args) {
		sync1 sy1=new sync1();
		sync1 sy2=new sync1();
		new Thread(new Runnable(){
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=1;i<=5;i++) {
					sy1.generate();
					}
				long endtime=System.currentTimeMillis();
				System.out.println("Time required for thread 1: "+(endtime-startTime));
				}
		}).start();
		new Thread(new Runnable(){
			
			public void run() {
				long startTime=System.currentTimeMillis();
				for(int i=1;i<=5;i++) {
					sy1.generate();
					}
				long endtime=System.currentTimeMillis();
				System.out.println("Time required for thread 2: "+(endtime-startTime));
				}
		}).start();
	}
}
