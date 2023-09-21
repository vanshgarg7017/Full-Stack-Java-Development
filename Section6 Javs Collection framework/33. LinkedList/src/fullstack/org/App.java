package fullstack.org;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;

class Names implements Comparable<Names> {
	private String name;
 
	public Names(String name) {
		this.name = name;
	}
 
	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return -1;
		} else {
			return 1;
		}
	}
 
	@Override
	public String toString() {
		return name;
	}
    
}
 
public class App {
 
	public static void main(String[] args) {
 
		List <String> names = new LinkedList<>();
		names.add(new Names("Chaand"));
		names.add(new Names("Ed"));
		names.add(new Names("John"));
		names.add(new Names("Mia"));
		
		App app = new App();
		app.printList(names);
		
		Collections.sort(names);
		System.out.println("******************");
		app.printList(names);
 
	}
 
	void printList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}
	}
 
}