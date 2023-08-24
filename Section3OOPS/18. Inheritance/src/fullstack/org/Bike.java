package fullstack.org;

public class Bike extends Vehicle {
	public String handle;
	public Bike() {
		super();
		this.handle="short";
	}
	public Bike(String handle) {
		super();
		this.handle=handle;
	}
	public String getHandle() {
		return handle;
	}
	
}
