package cache;

public class Node<T> {

	String key;
	T value;
	Node next;
	Node prev;
	
	public Node(String key, T value){
		this.value = value;
		this.key = key;
	}
	
	public String toString(){
		String valueString = value == null ? "null" : value.toString();
		return "Key: " + key + " | " + " Value: " + valueString;
	}
}
