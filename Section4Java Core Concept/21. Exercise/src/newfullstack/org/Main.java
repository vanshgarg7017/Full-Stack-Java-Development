package newfullstack.org;

public class Main {
	public static void main(String[] args) {
		Circle circle=new Circle(4);
		System.out.println("Area of the Circle is: "+circle.calculateArea());
		Rectangle rectangle=new Rectangle(12,34);
		System.out.println("Area of the Rectangle is : "+rectangle.calculateArea());
		Triangle triangle=new Triangle(5,9);
		System.out.println("Area of the triangle is  : "+triangle.calculateArea());
	}

}
