package map.org;

import java.util.HashMap;
import java.util.Map;

public class mapCollection {
public static void main(String[] args) {
	Map<Integer,String> student=new HashMap<>();
	student.put(1, "Vansh");
	student.put(2, "Mia");
	student.put(3, "Ram");
	for(Map.Entry<Integer, String> entry:student.entrySet()) {
		System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
	}
	System.out.println(student.get(3));
}
}
