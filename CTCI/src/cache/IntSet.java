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
	
	public void delete(int val){
		Integer[] bucket = getBucket(val);
		deleteFromBucket(bucket, val);
	}
	
	public boolean contains(int val){
		Integer[] bucket = getBucket(val);
		return checkBucket(bucket, val);
	}
	
	private boolean checkBucket(Integer[] bucket, int val){
		boolean res = false;
		for(int i = 0; i < bucket.length; i++){
			if(bucket[i] != null && bucket[i] == val){
				res = true;
				break;
			}
		}
		return res;

	}
	
	private void deleteFromBucket(Integer[] bucket, int val){
		for(int i = 0; i < bucket.length; i++){
			if(bucket[i] != null && bucket[i] == val){
				bucket[i] = null;
				break;
			}
		}

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
