package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
//		double []medians = RunningMedian.getMedians(new int []{1,2,3,4,5,6,7,8,9});
//		int [] arr = {10,-5,2,13,4,3,0,-9,4};
		Integer [] array = {1,3,5,2,4,6};
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(array));
		ArrayList<Integer> sorted = Sorting.quickSortList(arr);
		System.out.println(sorted);
	}
	
}




