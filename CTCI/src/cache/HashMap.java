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
	
	public void set(Key key, Value value){
		LinkedList<Key, Value> bucket = getBucket(key);
		if(contains(key)){
			bucket.update(key, value);
		}else {
			bucket.add(key, value);
		}
	}
	
	public Value get(Key key){
		Value res = null;
		if(contains(key)){
			LinkedList<Key, Value> bucket = getBucket(key);
			res = bucket.get(key).value;
		}
		return res;
	}
	
	private boolean contains(Key key){
		LinkedList<Key, Value> bucket = getBucket(key);
		boolean res = bucket.contains(key);
		return res;	
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
	
	private LinkedList<Key, Value> getBucket(Key key){
		int bucketI = Math.abs(hash(key)) % capacity;
		
		
		return store.get(bucketI);
	}
	
	private int hash(Key key){
		return key.hashCode();
	}
	
	
	
	

}
