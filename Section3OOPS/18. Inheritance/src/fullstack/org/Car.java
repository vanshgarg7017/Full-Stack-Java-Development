package fullstack.org;

public class Car extends Vehicle {
	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String fridge;
	public String entertainmentSystem;
	public Car() {
		super();
		this.airConditioner="Ac";
		this.entertainmentSystem="Mc";
		this.fridge="no";
		this.steering="Round";
		this.musicSystem="dj";
	}
	public Car(String steering, String musicSystem, String airConditioner, String fridge, String entertainmentSystem) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.fridge = fridge;
		this.entertainmentSystem = entertainmentSystem;
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getFridge() {
		return fridge;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	
}
