package cache;

import java.util.Arrays;

public class IntSet {

	private Integer[][] store;
	private int size;
	
	public IntSet(int size){
		this.store = new Integer [size][size];
		this.size = size;
	}
	
	public void insert(int val){
		Integer[] bucket = getBucket(val);
		fillEmptySlot(bucket, val);
	}
	
	public Integer delete(int val){
		return 5;
	}
	
	public boolean contains(int val){
		return true;
	}
	
	private void fillEmptySlot(Integer[] bucket, int val){
		for(int i = 0; i < bucket.length; i++){
			if(bucket[i] == null){
				bucket[i] = val;
				break;
			}
		}
	}
	
	private Integer[] getBucket(int val){
		int bucket = val % size; 
		return store[bucket];
	}
	
	public String toString(){
		String str = "[";
		for(Integer[] arr : store){
			str += Arrays.toString(arr);
		}
		str += "]";
		return str;
		
	}
}
