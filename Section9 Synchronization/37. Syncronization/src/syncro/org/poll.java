package syncro.org;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class po extends Thread{
	private String name;

	public po(String name) {
		this.name = name;
	}
	public void run() {
		System.out.println("Thread Started"+name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Ended"+name);
	}
	
}
public class poll {
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(2);
			po thread1=new po("Thread 1");
			po thread2=new po("Thread 2");
			po thread3=new po("Thread 3");
			po thread4=new po("Thread 4");
			po thread5=new po("Thread 5");
			po thread6=new po("Thread 6");
			po thread7=new po("Thread 7");
			po thread8=new po("Thread 8");
			po thread9=new po("Thread 9");
			po thread10=new po("Thread 10");
			po thread11=new po("Thread 11");
			po thread12=new po("Thread 12");
			po thread13=new po("Thread 13");
			po thread14=new po("Thread 14");
			po thread15=new po("Thread 15");
			po thread16=new po("Thread 16");
			po thread17=new po("Thread 17");
			po thread18=new po("Thread 18");
			po thread19=new po("Thread 19");
			po thread20=new po("Thread 20");
			service.execute(thread1);
			service.execute(thread2);
			service.execute(thread3);
			service.execute(thread4);
			service.execute(thread6);
			service.execute(thread7);
			service.execute(thread8);
			service.execute(thread9);
			service.execute(thread10);
			service.execute(thread11);
			service.execute(thread12);
			service.execute(thread13);
			service.execute(thread14);
			service.execute(thread15);
			service.execute(thread16);
			service.execute(thread17);
			service.execute(thread19);
			service.execute(thread20);
			service.shutdown();			
	}
}
