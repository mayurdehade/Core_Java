package core.collections.quque;

import java.util.ArrayDeque;

public class StackUsingDeque {

	public static void main(String[] args) {
		//Implementing stack using Deque
		
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Size of stack: "+stack.size()); //5 -> give size of deque
		
		System.out.println(stack);
		
		System.out.println("Peek: "+stack.peekLast()); //retrieve last input element of deque
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());

	}

}
