package fullstack.org;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ListIterator{
public static void main(String[] args) {
	LinkedList<String>countries=new LinkedList<>();
	countries.add("India");
	countries.add("Bharat");
	countries.add("Pakistan");
	countries.add("Brazil");
	countries.add("England");
	countries.add("Canada");
	ListIterator iterator=new ListIterator();
	iterator.printlist(countries);
	System.out.println("**********");
	countries.sort(null);
	iterator.printlist(countries);
	System.out.println("**********");
	Collections.reverse(countries);
	iterator.printlist(countries);
	System.out.println(countries);
}
void printlist(List<String> list) {
	Iterator<String> iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println("Elements: "+iterator.next() );
	}
}
}

