package fullstack.org;

public class Vegan extends Person {


	public void eat() {
		System.out.println("Eats Vegan");
		
	}

}
class Nonvegan extends Person{

	@Override
	public void eat() {
		System.out.println("Eats NonVegan");
		
	}
	
}
