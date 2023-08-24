package fullstack.org;

public class Vehicle {
	public String engine;
	public int wheels;
	public int seats;
	public int fueTank;
	public String lights;
	public Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fueTank = 35;
		this.lights = "LED";
	}
	public Vehicle(String engine, int wheels, int seats, int fueTank, String lights) {
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fueTank = fueTank;
		this.lights = lights;
	}
	public String getEngine() {
		return engine;
		
	}
	public int getWheels() {
		return wheels;
	}
	public int getSeats() {
		return seats;
	}
	public int getFueTank() {
		return fueTank;
	}
	public String getLights() {
		return lights;
	}
	
	
}
