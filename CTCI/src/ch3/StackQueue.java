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
	
	public void dequeue(){
		if(this.popStack.isEmpty()){
			fillPopStack();
		}
	}
	
	public void fillPopStack(){
		
	}
	
	public boolean isEmpty(){
		return this.pushStack.isEmpty() && this.popStack.empty();
	}
	
	public String toString(){
		return this.pushStack.toString() + " " + this.popStack.toString();
	}
	
}
