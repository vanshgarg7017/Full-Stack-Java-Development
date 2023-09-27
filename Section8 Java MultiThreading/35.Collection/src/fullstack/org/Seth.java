package fullstack.org;

import java.util.HashSet;
import java.util.Set;

public class Seth {
public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	set.add("Ram");
	set.add("Raj");
	set.add("Jaan");
	set.add("Khan");
	set.add("Ram");
	for(String name:set) {
		System.out.println(name);
	}
	System.out.println(set.contains(1));
}
}
