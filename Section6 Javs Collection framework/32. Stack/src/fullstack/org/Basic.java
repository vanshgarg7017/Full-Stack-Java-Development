package fullstack.org;

import java.util.Stack;

public class Basic {
public static void main(String[] args) {
	Stack<Integer> demo=new Stack<>();
	demo.push(0);
	demo.push(2);
	demo.push(4);
	demo.push(5);
	demo.push(8);
	System.out.println(demo.peek());
	demo.pop();
	System.out.println("********");
	System.out.println(demo.peek());
	for(Integer temp: demo) {
		System.out.println(temp);
	}
	System.out.println("*********");
	System.out.println(demo.peek());
	if(demo.isEmpty()) {
		System.out.println("Stack is empty");
	}
	else {
		System.out.println("Stack is not empty");
	}
	demo.search(8);
	System.out.println(demo.search(8));
}
}
