package ch3;

import java.util.Stack;

public class SortStack<E>{

	Stack<E> store;
	Stack<E> tempStack;
	
	public SortStack(){
		this.store = new Stack<>();
		this.tempStack = new Stack<>();
	}
}
