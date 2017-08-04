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
		if(map.get(key) != null){
			update(key, value);
		}else if(currentSize < size){
			add(key, value);
			currentSize++;
		}else {
			Node<Key, Value> node = list.removeFirst();
			map.delete(node.key);
			add(key, value);
		}
	}
	
	private void add(Key key, Value value){
		Node<Key, Value> node = list.add(key, value);
		map.set(key, node);
	}
	
	private void update(Key key, Value value){
		Node<Key, Value> node = list.update(key, value);
		map.set(key, node);
	}
	
	public String toString(){
		return "Map : " + map.toString() + "\n\nList: " + list.toString();
	} 
}
