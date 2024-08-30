package core.collections.quque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeDemo {

	public static void main(String[] args) {
		
		//ArrayDeque is a class. It also implement like stack.
		//This provides a methods of Queue only 
//		Queue<Integer> dq = new ArrayDeque<Integer>();
		
		//This provides the methods of ArrayDeque, Deque and Queue also
//		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		
		//This provides the methods of Queue and Deque
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		dq.offer(10); //added to last of quque
		dq.offerLast(20); //added to last of queue same like offer
		dq.offerFirst(30); //added to front of queue

		System.out.println(dq); //[30, 10, 20]
		
		System.out.println(dq.poll()); //remove element from first it work like pollFirst()
		System.out.println(dq.pollLast()); //remove element from last
		
		dq.offerLast(40); //added to last of queue same like offer
		dq.offerFirst(50);
		
		System.out.println(dq);
		
		System.out.println(dq.peek()); //give first element it same like peekFirst()
		System.out.println(dq.pollLast()); //give last element
		
		
	}

}
