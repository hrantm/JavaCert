package cache;
import java.util.ArrayList;

public class HashMap<Key, Value> {
	
	
	private ArrayList<LinkedList<Key, Value>> store = new ArrayList<>();
	private int capacity;
	private int size;
	
	public HashMap(int capacity){
		this.capacity = capacity;
		fillStore();
	}
	
	private void fillStore(){
		int count = capacity;
		
		while(count > 0){
			store.add(new LinkedList<Key, Value>());
			count--;
		}
	}
	
	public HashMap(){
		this(4);
	}
	
	public String toString(){
		return store.toString();
	}
	
	
	
	

}
