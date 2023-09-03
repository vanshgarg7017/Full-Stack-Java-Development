package fullstack.Empolyee.org;

public abstract class Empolyee {
	protected String name;
	protected double baseSalary;
	public Empolyee(String name,double baseSalary) {
		this.name=name;
		this.baseSalary=baseSalary;
	}
public abstract double calculateSalary();
public abstract void displayInfo();
}
