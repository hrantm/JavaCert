package hackerRank;

import java.util.*;

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
		String s = "he1l3lo5";
		String[] arr = s.split("");
		Collections.sort(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));
		
	}
	
}



		






