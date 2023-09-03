package fullstack.InnerClass.org;

public class OuterClass {
static int outer_x=10;
int outer_y=20;
private int outer_private=30;

//inner class
class InnerClass{
	void display() {
		System.out.println("outer x is: "+outer_x);
		System.out.println("Outer y is : "+outer_y);
		System.out.println("Outer private is : "+outer_private);
	}
}
}
