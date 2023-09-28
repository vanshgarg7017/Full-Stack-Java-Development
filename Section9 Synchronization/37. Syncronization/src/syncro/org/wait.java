package syncro.org;

public class wait {
	static public int balance=0;
	 public void withdraw(int amount) {
		 synchronized(this) {
		if(balance<=0) {
			try {
				System.out.println("we withdrawing rupees in the account");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 }
		balance=balance-amount;
		System.out.println("Withdrawal successfull");
	}
	 public void deposit(int amount) {
		 System.out.println("we are depositing the amount");
		 amount=balance+amount;
		 synchronized (this) {
			 notifyAll(); 
		}
		 
	 }
	 public static void main(String[] args) {
		wait w=new wait();
		Thread thread1=new Thread(new Runnable() {

			@Override
			public void run() {
				w.withdraw(1000);
			}
			
		});
		thread1.setName("thread 1");
		thread1.start();
		
		
		Thread thread2=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				w.deposit(2000);
			}
			
		});
		thread2.setName("Thread 2");
		thread2.start();
		
	}
}
