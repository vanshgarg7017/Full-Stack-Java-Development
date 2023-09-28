package syncro.org;

public class App {
	public static int counter=0;
public static void main(String[] args) throws InterruptedException{
	Thread thread1=new Thread(new Runnable() {
		public void run() {
			for(int i=1;i<=1000;i++) {
				App.counter++;
			}
			System.out.println("the loops in thread1 is over");
		}
	});
	Thread thread2=new Thread(new Runnable() {
		public void run() {
			for(int i=1;i<=1000;i++) {
				App.counter++;
			}
			System.out.println("the loop is thread2 is over");
		}
	});
	thread1.start();
	thread2.start();
	Thread.sleep(2000);
	System.out.println("the value of counter is :"+App.counter);
}
}
