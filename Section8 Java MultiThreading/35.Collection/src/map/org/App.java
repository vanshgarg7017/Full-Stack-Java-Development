package map.org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class App {
	public static void main(String[] args) {
		Map<Integer, String> student=new HashMap<>();
		student.put(1,"Vansh");
		student.put(2,"Raj");
		student.put(10,"Jaan");
		student.put(4,"Kaam");
		student.put(5,"Run");
		Iterator<Entry<Integer,String>> entry=student.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<Integer, String> temp=entry.next();
			System.out.println("Key: "+temp.getKey()+" Value : "+temp.getValue());
		}
//		for(Map.Entry<Integer,String> entry:student.entrySet()) {
//			System.out.println("Key : "+entry.getKey()+ "Value: "+entry.getValue());
//		}
	}


}
