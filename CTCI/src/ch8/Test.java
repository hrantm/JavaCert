package ch8;

import java.util.Arrays;

public class Test {
	
	static int[][] matrix = {
			{1,1,1,1,1,1,1,1},
			{1,1,0,1,1,1,0,1},
			{1,1,1,1,0,1,1,1},
			{0,1,0,1,1,0,1,1},
			{1,1,0,1,1,1,1,1},
			{1,1,1,0,0,1,0,1},
			{1,0,1,1,1,0,1,1},
			{1,1,1,1,1,1,1,1}
	};


	public static void main(String[] args) {
		int [] arr = {1,2,3};
		int [][] res = Sets.subSets(arr);
		for(int [] a : res){
			System.out.println(Arrays.toString(a));
		}
		
		
	}
}









