
public class MethodOverloading {
public static void main(String[] args) {
	System.out.println("Area of rectangle " + area(14.25d, 10.65d));
	System.out.println("Area of Squ");
}
public static double area(double length,double width) {
	return(length*width);
}
public static double area(double side) {
	return(side*side);
}
}
