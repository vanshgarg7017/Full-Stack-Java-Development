package Fullstack.org;

public class value_by_reference {
public static void main(String[] args) {
	String[] names= {"chand","john","steve","pooja","rahul"};
	value_by_reference reference=new value_by_reference();
	reference.displayNames(names);
	System.out.println("***********");
	System.out.println(names[0]);
}
void displayNames(String[]names) {
	names[0]="salim";
	for(String name:names) {
		System.out.println(name);
	}
}
}
