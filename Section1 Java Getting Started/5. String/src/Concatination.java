
public class Concatination {
	public static void main(String[] args) {
		String var1="Full";
		String var2=" Stack";
//		String var3=var1 + var2;
		String var3=var1.concat(var2);
		System.out.println(var3);
		System.out.println("*************");
		String var4=var3.replace("Full", "Half");
		System.out.println(var4);
		System.out.println("******");
		if(var4.equals("Half Stack")) {
			System.out.println("You are right");
		}
		else {
			System.out.println("You are Wrong");
		}
		
	}
}
