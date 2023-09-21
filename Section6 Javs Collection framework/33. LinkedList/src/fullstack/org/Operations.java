package fullstack.org;

import java.util.LinkedList;

public class Operations {
public static void main(String[] args) {
	LinkedList<String>countries=new LinkedList<>();
	countries.add("India");
	countries.add("Bharat");
	countries.add("Pakistan");
	countries.add("Brazil");
	countries.add("England");
	countries.add("canada");
	new Operations().printlist(countries);
	countries.add("Arab");
	countries.add("USA");
	new Operations().printlist(countries);
	countries.add(0,"canada");
	new Operations().printlist(countries);
	countries.remove();
	new Operations().printlist(countries);
	
}
void printlist(LinkedList<String> list) {
	for(String element: list) {
		System.out.println("Elements: "+element);
	}
	System.out.println("**********");
}
}
