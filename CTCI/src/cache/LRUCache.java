package cache;

public class LRUCache<Key, Value> {

	private int size;
	private int currentSize;
	private LinkedList<Key, Value> list = new LinkedList<>();
	private HashMap<Key, Node<Key, Value>> map;
	public LRUCache(int size){
		this.size = size;
		 this.map = new HashMap<>(size);
	}
	
	public void set(Key key, Value value){
		if(currentSize < size){
			add(key, value);
			currentSize++;
		}else{
			update(key, value);
		}
	}
	
	private void add(Key key, Value value){
		list.add(key, value);
	}
	
	private void update(Key key, Value value){
		
	}
}