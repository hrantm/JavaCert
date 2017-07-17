package ch3;

import java.util.Stack;

public class Test {
	
	public static void main(String[] args) {
		NodeStack<Double> stack = new NodeStack<>();
		stack.push(10.0);
		stack.push(12.4);
		stack.push(13.3);
		stack.push(14.2);
		stack.push(15.1);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push(18.2);
		System.out.println("----------------");
		System.out.println(stack);
	}
}