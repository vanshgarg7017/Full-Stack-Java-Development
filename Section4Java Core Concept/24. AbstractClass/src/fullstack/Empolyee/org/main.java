package fullstack.Empolyee.org;

public class main {
public static void main(String[] args) {
	Empolyee manager=new Manager("Vansh", 550000, 4000);
	Empolyee programmer=new Progammer("Raj", 55000, 14, 1000);
	manager.displayInfo();
	System.out.println("------------------");
	programmer.displayInfo();
}

}
