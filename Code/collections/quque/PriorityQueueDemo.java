package core.collections.quque;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		//Implementation of priority queue
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(10);
		pq.offer(50);
		pq.offer(80);
		pq.offer(70);
		pq.offer(20);
		
		System.out.println(pq);
		
		//priority queue pop element based on priority in Integer case give small integer first
		System.out.println(pq.poll()); //first element is 10
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		
		//String type of priority queue it give element in alphabetical order
		Queue<String> stringPQ = new PriorityQueue<>();
		
		stringPQ.offer("Anjali");
		stringPQ.offer("Mayur");
		stringPQ.offer("Chetan");
		stringPQ.offer("Ketan");
		stringPQ.offer("Dipak");
		
		
		
		System.out.println(stringPQ.poll()); //give Anjali first because of staring with A
		System.out.println(stringPQ.poll()); //Chetan
		
		System.out.println(stringPQ);
		
		
		//Set priority using comparator 
		Queue<Integer> newPQ = new PriorityQueue<>((a,b)->(b-a)); //give large element first
		
		newPQ.offer(10);
		newPQ.offer(50);
		newPQ.offer(80);
		newPQ.offer(70);
		newPQ.offer(20);
		
		System.out.println(newPQ);
		
		System.out.println(newPQ.poll()); //give 80 large element first

	}

}
