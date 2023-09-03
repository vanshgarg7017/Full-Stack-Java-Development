package fullstack.animal.org;

public class Animal implements AnimalEat, AnimalTravel {

	@Override
	public void travel() {
		System.out.println("Animal is Travelling");
		
	}

	@Override
	public void eat() {
System.out.println("Animal is Eating");		
	}

}
