package fullstack.org;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Iterators{
public static void main(String[] args) {
	LinkedList<String>countries=new LinkedList<>();
	countries.add("India");
	countries.add("Bharat");
	countries.add("Pakistan");
	countries.add("Brazil");
	countries.add("England");
	countries.add("canada");
	new Iterators().printlist(countries);
	
}
void printlist(List<String> list) {
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println("Elements: "+iterator.next() );
	}
}
}
