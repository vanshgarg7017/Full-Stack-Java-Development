package fullstack.Empolyee.org;

public class Progammer extends Empolyee {
	private int overtimehours;
	private double rateofovertime;
public Progammer(String name, double baseSalary, int overtimehours, double rateforovertime) {
		super(name, baseSalary);
		this.overtimehours=overtimehours;
		this.rateofovertime=rateforovertime;
		
	}



	@Override
	public double calculateSalary() {
	return baseSalary+(overtimehours*rateofovertime);
	}

	@Override
	public void displayInfo() {
		System.out.println("Progammer name: "+name);
		System.out.println("Base Salary :"+baseSalary);
		System.out.println("OverTime : "+overtimehours);
		System.out.println(" hourly rate :"+rateofovertime);
		System.out.println("Total  salary :"+calculateSalary());
		
	}

}
