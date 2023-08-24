package fullstack.org;

public class car {
private String doors;
private String engine;
private String driver;
private int speed;
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getSpeed() {
	return speed;
}
public void setDoors(String doors) {
	this.doors = doors;
}
public void setEngine(String engine) {
	this.engine = engine;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getDoors() {
	return doors;
}
public String getEngine() {
	return engine;
}
public String getDriver() {
	return driver;
}
public String run() {
	if(doors.equals("Closed")&&engine.equals("on")&& driver.equals("seated")&&speed>0) {
		return "Car is running";
	}
	else {
		return "Car is Stop";
	}
}
}
