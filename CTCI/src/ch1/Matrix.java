package ch1;

public class Matrix {
	
	public static Integer[][] transpose(Integer[][] arr){
		Integer[][] res = new Integer[arr[0].length][arr.length];
		for(int i = 0; i < arr[0].length; i++){
			for(int j = 0; j < arr.length; j++){
				res[i][j] = arr[j][i];
			}
		}
		return res;
	}
	
}
