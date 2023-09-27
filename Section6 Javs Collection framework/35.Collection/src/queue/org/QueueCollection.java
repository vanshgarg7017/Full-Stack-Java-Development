package queue.org;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
public class QueueCollection {
public static void main(String[] args) {
	Queue<String> queue=new ArrayBlockingQueue<>(6);
	queue.add("Name");
	queue.add("Class");
	queue.add("Section");
	queue.add("UID");
	queue.add("University");
	queue.add("Group");
	System.out.println(queue.offer("HAATT"));
	for(String name:queue) {
		System.out.println(name);
	}
}
}
