package ch1;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		Integer[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		Matrix.transpose(arr);
		for(int i = 0; i < arr.length; i++){
			ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr[i])); 
			System.out.println(list);
		}

	}
}

//{
//	{7,4,1},
//	{8,5,2},
//	{9,6,3}
//}
//	