// When a small range data type variable is converted into a large range data type, Implicit
// byte >> short >> int >> long >> float >> double  
public class Implicit {
public static void main(String[] args) {
	short x=10;
	int y=x;
	int z=100;
	double m=z;
	System.out.println(y);
	System.out.println(m);
}
}
