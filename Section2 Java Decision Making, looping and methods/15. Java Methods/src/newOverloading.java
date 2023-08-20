
public class newOverloading {
public static void main(String[] args) {
	System.out.println("1+2 : "   +sum(1,2));
	System.out.println("1+2.5 : "  +sum(1,2.5));
	System.out.println("1.5+2.5 : "  +sum(1.5,2.5));
}
public static int sum(int x,int y) {
	System.out.println("Adding Two integer entities");
	return x+y;
}
public static float sum(int x,float y) {
	System.out.println("Adding one integer and one float entity");
	return x+y;
}
public static double sum(double x,double y) {
	System.out.println("Adding Two double entity");
	return x+y;
}
}
