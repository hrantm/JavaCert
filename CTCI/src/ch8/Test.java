package ch8;

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
		int[] arr1 = {-40, -20, 2, 4, 6, 8, 9, 10, 11, 12, 13};
		System.out.println(MagicIndex.findIndexUnique(arr1));
		
	}
}









