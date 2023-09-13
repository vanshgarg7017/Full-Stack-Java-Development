package Fullstack.org;

public class passing_a_value {
public static void main(String[] args) {
	String [] names= {"ram","John","steve","pooja"};
	passing_a_value method=new passing_a_value();
	method.displaynames(names);
}
void displaynames(String []names) {
	for(String name:names) {
		System.out.println(name);
	}
	names[0]="Raj";
}
}
