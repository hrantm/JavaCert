package aAProbs;

import java.util.ArrayList;
import java.util.Arrays;



public class Test {
	
	public static void main(String args[]) {
		System.out.println(NearestLarger.nearest(new int [] {2,6,4,8}, 2));
	}
	
	public static void varArgsTest(int ... nums){
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
