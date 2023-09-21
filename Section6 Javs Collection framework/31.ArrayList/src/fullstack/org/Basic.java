package fullstack.org;

import java.util.ArrayList;

public class Basic {
	static ArrayList<String> names=new ArrayList<String>();
public static void main(String[] args) {
	names.add("chand");
	names.add("Raj");
	names.add("Ram");
	names.add("Kaam");
	names.add("Dev");
	names.add("Jaan");
	names.add("Love");
	names.add("Rahul");
	names.add("Kittu");
	Basic basic=new Basic();
	basic.displaylist(names);
	System.out.println("***********");
	System.out.println(names);
	int Position=basic.search("chand");
	if(Position!=-1) {
		basic.modifylist(Position,"Kittu");
	}
	else {
		System.out.println("Invalid Entry");
	}
	System.out.println("********");
	basic.displaylist(names);
	System.out.println("**********");
	basic.removebyindex(5);
	basic.displaylist(names);
	basic.removebyname("Rahul");
	System.out.println("***********");
	basic.displaylist(names);
}

void displaylist(ArrayList<String> names) {
	for(String name:names) {
		System.out.println(name);
	}
}
void removebyindex(int position) {
	names.remove(position);
}
void removebyname(String name) {
	names.remove(name);
}
void modifylist(int Position,String newnames) {
	names.set(Position,newnames);
}
 int search(String name) {
	return names.indexOf(name);
}
}
