package cache;

public class LinkedList<T>{

	private Node<T> head = new Node<T>("Head", null);;
	private Node<T> tail = new Node<T>("Tail", null);;
	
	public LinkedList(){
		head.next = tail;
		tail.prev = head;
	}
	
	public void add(String key, T value){
		Node<T> newNode = new Node<T>(key, value);
		Node<T> currentEnd;
		
		if(isEmpty()){
			currentEnd = head;
		}else {
			currentEnd = last();
		}
		
		currentEnd.next = newNode;
		newNode.prev = currentEnd;
		
		newNode.next = tail;
		tail.prev = newNode;
	}
	
	public Node<T> get(String key){
		Node<T> res = null;
		Node<T> current = head;
		while(current != null){
			if(current.key == key){
				res = current;
			}
			current = current.next;
		}
		return res;
	}
	
	public boolean contains(String key){
		boolean res = false;
		Node<T> node = get(key);
		if(node != null){
			res = true;
		}
		return res;
	}
	
	
	
	
	
	public Node<T> last(){
		Node<T> res = null;
		if(!isEmpty()){
			res = tail.prev;
		}
		return res;

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
	
	public String toString(){
		String res = "";
		Node<T> current = head; 
		while(current != null){
			res += " " + current.toString();
			current = current.next;
			res += "\n";
		}
		return res;
	}
}