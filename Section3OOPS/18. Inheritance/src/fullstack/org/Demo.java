package fullstack.org;

public class Demo {
public static void main(String[] args) {
	Bike bike=new Bike();
	Car car=new Car();
	Truck truck=new Truck("Round","dj","Ac","Full");
	System.out.println(bike.getHandle());
	System.out.println(bike.getEngine());
	System.out.println(car.getAirConditioner());
}
}
