package fullstack.org;

public class Car {
	private int speed;
	private String engine;
	private String driver;
	private String doors;
	public Car(){
		speed=10;
		doors="closed";
		engine="on";
		driver="seated";
	}
	public String run() {
		if(doors.equals("closed")&&driver.equals("seated")&&engine.equals("on")&&speed>0) {
			return "Car is running";
		}
		else {
			return "car is stop";
		}
	}

}
