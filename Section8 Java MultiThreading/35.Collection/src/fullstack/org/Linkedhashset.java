package fullstack.org;

import java.util.Set;
import java.util.LinkedHashSet;
public class Linkedhashset {
public static void main(String[] args) {
	Set<String> set=new LinkedHashSet();
	for(int i=30;i>0;i--) {
		System.out.println("A"+i);
	}
	for(String i:set) {
		System.out.println(i);
	}
	
	
}
}
