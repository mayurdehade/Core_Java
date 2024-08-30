package core.collections.quque;

import java.util.ArrayDeque;

public class QueueUsingDeque {

	public static void main(String[] args) {
		//Implementing Queue using Deque
		
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		System.out.println("Size of queue "+queue.size()); //give size of Deque
		
		System.out.println(queue.peek()); //give first element of Deque
		
		System.out.println(queue);
		
		while(!queue.isEmpty()) 
			System.out.println(queue.pop());

		
	}

}
