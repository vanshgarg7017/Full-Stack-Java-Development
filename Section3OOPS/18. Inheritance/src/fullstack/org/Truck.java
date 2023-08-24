package fullstack.org;

public class Truck extends Vehicle{
	public String steering;
	public String musicsystem;
	public String airConditioner;
	public String container;
	public Truck() {
		super();
		this.steering="Round";
	}
	public Truck(String steering, String musicsystem, String airConditioner, String container) {
		super(steering,musicsystem,airConditioner, container);
		this.steering = steering;
	}
	public String getSteering() {
		return steering;
	}	
}
