package ch1;

public class Matrix {
	
	public static void transpose(Integer[][] arr){
//		Integer[][] res = new Integer[arr[0].length][arr.length];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				
			}
		}
	}
	
	public static void exch(int i, int j, Integer[][] arr){
		Integer temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}
}
