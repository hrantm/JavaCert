package cache;

import java.util.Arrays;

public class IntSet {

	int[][] store;
	
	public IntSet(int size){
		this.store = new int [size][size];
	}
	
	public String toString(){
		return Arrays.toString(store);
	}
}
