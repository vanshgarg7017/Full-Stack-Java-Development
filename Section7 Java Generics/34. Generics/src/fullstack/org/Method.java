package fullstack.org;

import java.util.ArrayList;
import java.util.List;
class Jaan{
	public <E> void printListJaan(List<E> list) {
		for(E element:list) {
			System.out.println(element);
		}
	}
	public<E> void printArrayJaan(E[] arrayJaan) {
		for(E element:arrayJaan) {
			System.out.println(element);
		}
	}
}
public class Method {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	Jaan Jaan=new Jaan();
	System.out.println("*********");
	Jaan.printListJaan(list);
	List<String> list2=new ArrayList<>();
	list2.add("one");
	list2.add("Two");
	list2.add("Three");
	list2.add("Four");
	System.out.println("************");
	Jaan.printListJaan(list2);
	String[] StringArray= {"one","two","three"};
	Integer[] IntegerArray= {1,2,3,4};
	Jaan jaan=new Jaan();
	System.out.println("*************");
	jaan.printArrayJaan(StringArray);
	System.out.println("********************");
	jaan.printArrayJaan(IntegerArray);
	
}
}
