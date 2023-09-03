package fullstack.org;

public class main {
public static void main(String[] args) {
	Person john=new Vegan();
	john.speak();
	john.eat();
	System.out.println("_____________");
	Person mia=new Nonvegan ();
	mia.eat();
	mia.speak();
}
}
