package ch3;



public class Test {
	
	public static void main(String[] args) throws StackEmptyException{
		SortStack stack = new SortStack();
		stack.push(10);
		stack.push(20);
		stack.push(40);
		stack.push(0);
		System.out.println(stack);
	}
	 

}
