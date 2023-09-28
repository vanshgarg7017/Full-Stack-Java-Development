package syncro.org;

public class interrupt {
	static public int balance=0;
	 public void withdraw(int amount) {
		 synchronized(this) {
		if(balance<=0) {
			try {
				System.out.println("we withdrawing rupees in the account");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Orginal amount: "+balance);
				System.out.println("Withdrawal amount : "+balance);
				balance=balance-amount;
				System.out.println("Withdrawal successfull and current balance is :"+balance);
				
				}
		}
		 }
		
	}
	 public void deposit(int amount) {
		 System.out.println("we are depositing the amount : "+amount);
		 amount=balance+amount;	 
	 }
	 public static void main(String[] args) {
		interrupt w1=new interrupt();
		Thread thread1=new Thread(new Runnable() {

			@Override
			public void run() {
				w1.withdraw(1000);
			}
			
		});
		thread1.setName("thread 1");
		thread1.start();
//		if(balance <=0) {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			thread1.interrupt();
//			}
		
		Thread thread2=new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				w1.deposit(2000);
				thread1.interrupt();
			}
			
		});
		thread2.setName("Thread 2");
		thread2.start();
		
	}
}
