package ch3;

import java.util.Stack;

public class StackQueue<T> {

	Stack<T> pushStack;
	Stack<T> popStack;
	public StackQueue(){
		this.pushStack = new Stack<>();
		this.popStack = new Stack<>();
	}
	
	public void queue(T el){
		this.pushStack.push(el);
	}
}
