package queue.org;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
public class QueuePoll {
public static void main(String[] args) {
	Queue<Integer> queue=new ArrayBlockingQueue<>(6);
	System.out.println(queue.peek());
	System.out.println("******");
	System.out.println(queue.poll());
	queue.offer(1);
	queue.offer(2);
	queue.offer(3);
	queue.offer(4);
	queue.offer(5);
	queue.offer(6);
	queue.offer(7);
	for(int n:queue) {
		System.out.println(n);
	}
	System.out.println("********");
	System.out.println(queue.peek());
	System.out.println("*********");
	System.out.println("Remove number from the list: "+queue.poll());
}
}
