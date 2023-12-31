package MultiThreading.org;
import java.util.Random;
 
 
class MyCounter implements Runnable{
	private int threadNo;
 
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
 
	public void run() {
		Random random = new Random();
		for(int i = 1;i<=9;i++){
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
		
	}
	
	
}
 
public class NewRunnable {
 
	public static void main(String[] args) throws InterruptedException {
//		Thread thread1 = new Thread(new MyCounter(1));
//		Thread thread2 = new Thread(new MyCounter(2));
//		
//		thread1.start();
//		thread2.start();
		Thread thread=new  Thread(new Runnable() {
			public void run() {
				for(int i=0;i<9;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
				
				
			}
		});
		thread.start();
				
	   
}
}