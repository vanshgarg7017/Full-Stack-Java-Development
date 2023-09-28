package syncro.org;

public class Join {
public int counter=0;
public static void main(String[] args) {
	Join join1=new Join();
	Thread thread1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<1000;i++) {
				join1.counter++;
			}
		}
	});
	
	Thread thread2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			try {
				thread1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i=0;i<1000;i++) {
				join1.counter++;
			}
		}
	});
	thread1.start();
	thread2.start();
	try {
		thread2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("The value for counter is :"+join1.counter);
}
}
