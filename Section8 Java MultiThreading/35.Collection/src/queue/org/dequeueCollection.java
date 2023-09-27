package queue.org;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class dequeueCollection {
public static void main(String[] args) {
	Deque<Integer> dequeue=new LinkedBlockingDeque<>();
	dequeue.offer(1);
	dequeue.offer(2);
	dequeue.offer(3);
	dequeue.offer(4);
	dequeue.offer(5);
	dequeue.offer(6);
	dequeue.offer(7);
	for(Integer elements: dequeue) {
		System.out.println(elements);
	}
	System.out.println("********");
	dequeue.addFirst(0);
	dequeue.removeLast();
	for(Integer elements: dequeue) {
		System.out.println(elements);
	}
}
}
