package fullstack.StaticClass.org;

public class OuterClass {
static int outer_x=10;
int outer_y=20;
private static int outer_private=30;
static class StaticNestedClass{
	void display() {
		System.out.println("outer x is: "+outer_x);
		System.out.println("outer private is: "+outer_private);
		OuterClass out=new OuterClass();
		System.out.println("outer y is: "+out.outer_y);
	}
}
}
