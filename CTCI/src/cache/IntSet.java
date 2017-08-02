package cache;

import java.util.Arrays;

public class IntSet {

	Integer[][] store;
	
	public IntSet(int size){
		this.store = new Integer [size][size];
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
