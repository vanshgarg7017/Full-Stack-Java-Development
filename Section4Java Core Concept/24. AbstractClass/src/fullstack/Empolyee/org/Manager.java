package fullstack.Empolyee.org;

public class Manager extends Empolyee {
private double bonus;
	public Manager(String name, double baseSalary,double bonus) {
		super(name, baseSalary);
		this.bonus=bonus;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
		
	}

	@Override
	public void displayInfo() {
		System.out.println("Manager name : "+name);
		System.out.println("Base Salary : "+baseSalary);
		System.out.println("Bonus :$ "+bonus);
		System.out.println("Total Salary :"+calculateSalary());
	}

}
