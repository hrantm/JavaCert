package ch3;



public class Test {
	
	
	
	public static void main(String[] args){
		StackQueue<Integer> queue = new StackQueue<>();
		queue.queue(10);
		queue.queue(20);
		System.out.println(queue.toString());
	}
	
	
}
