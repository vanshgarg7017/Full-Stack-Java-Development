package fullstack.org;

public class hello {
	public static void main(String[] args) {
		car caar=new car();
		caar.setSpeed(10);
		caar.setDoors("Closed");
		caar.setDriver("seated");
		caar.setEngine("on");
//		System.out.println("The Car speed is:  "+caar.getSpeed());
		System.out.println(caar.run());
		
	}
}
