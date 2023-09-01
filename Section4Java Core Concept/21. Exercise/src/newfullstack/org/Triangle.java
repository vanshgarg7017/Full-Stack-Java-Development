package newfullstack.org;

public class Triangle extends Shape {
private double base;
private double height;
public Triangle(double base,double height) {
	this.height=height;
	this.base=base;
}
public double calculateArea() {
	return 0.5 *height*base;
}
}
