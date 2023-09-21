package fullstack.org;

import java.util.ArrayList;
class intWrapper{
	public int intValue;
	public intWrapper(int intValue) {
		this.intValue=intValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue=intValue;
	}
}

public class autoboxing {
public static void main(String[] args) {
//	ArrayList<Integer> studentsnumbers=new ArrayList<>();
//	studentsnumbers.add(35);
//	System.out.println(studentsnumbers.get(0));
	
//	ArrayList<intWrapper> studentsnumbers=new ArrayList<>();
//studentsnumbers.add(new intWrapper(12)); //Autoboxing 
//studentsnumbers.add(new intWrapper(65));
//System.out.println(studentsnumbers.get(1).intValue); // unboxing
	ArrayList<Double> demolist=new ArrayList<>();
	demolist.add(Double.valueOf(10.0));
//	System.out.println(demolist.get(0));
	System.out.println(demolist.get(0).doubleValue());
	
}
}
