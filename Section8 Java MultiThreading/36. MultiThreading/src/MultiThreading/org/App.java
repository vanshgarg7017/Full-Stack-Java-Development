package MultiThreading.org;
class My extends Thread{
	private int threadNo;
 
	public My(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe(){
		for(int i=1; i<=9;i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	
}
public class App {
	 
	public static void main(String[] args) throws InterruptedException {
		My counter1 = new My(1);
		My counter2 = new My(2);
		
	    long startTime = System.currentTimeMillis();
		counter1.run(); //Run should be called by JVM
		System.out.println("**************************");
		counter2.run(); //Run should be called by JVM
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process: "+(endTime-startTime));
	}
 
}