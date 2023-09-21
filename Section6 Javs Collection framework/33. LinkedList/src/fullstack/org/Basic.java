package fullstack.org;

import java.util.LinkedList;

public class Basic {
public static void main(String[] args) {
	LinkedList<String> link=new LinkedList<>();
	link.add("India");
	link.add("pakistan");
	link.add("Russia");
	new Basic().printlist(link);
	
}

 void printlist(LinkedList<String> link) {
	for(String element:link) {
		System.out.println("Element :"+element);
	}
	
}
}
