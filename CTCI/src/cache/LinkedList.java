package cache;

public class LinkedList<T>{

	private Node<T> head = new Node<T>(null);;
	private Node<T> tail = new Node<T>(null);;
	
	public LinkedList(){
		head.next = tail;
		tail.prev = head;
	}
	
	public Node<T> first(){
		Node<T> res = null;
		if(!isEmpty()){
			res = head.next;
		}
		return res;
	}
	
	public boolean isEmpty(){
		boolean res = false;
		if(head.next == tail){
			res = true;
		}
		return res;
	}
}
