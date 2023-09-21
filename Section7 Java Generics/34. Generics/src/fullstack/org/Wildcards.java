package fullstack.org;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	private int vehicleId;

	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}
	
}
class Car extends Vehicle{
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}
	
	
}
public class Wildcards {
	public static void main(String[] args) {
		List<Vehicle> list=new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(14));
		list.add(new Car(11, "A12"));
		display(list);
		
		
		
	}
	public static void display(List<?> list) {
		for(Object element:list) {
			System.out.println(element);
		}
	}


}
