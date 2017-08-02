package cache;

public class MaxIntSet {
	
	boolean [] store;
	public MaxIntSet(int max){
		this.store = new boolean[max];
	}
	
	public void insert(int val){
		store[val] = true;
	}
	
	public boolean contains(int val){
		boolean res = false;
		if(store[val]){
			res = true;
		}
		return res;
	}
	
	public void delete(int val){
		store[val] = false;
	}
}
