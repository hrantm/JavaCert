package hackerRank;

import java.util.Arrays;

public class ConnectedGrid {
	
	public static int BFSGrid(int[][] matrix, int m, int n){
		int res = 0;
		boolean [][] visitGrid = new boolean [m][n];
		printGrid(visitGrid);
		return res;
	}
	
	public static void printGrid(boolean[][] grid){
		for(boolean[] arr : grid){
			System.out.println(Arrays.toString(arr));
		}
	}

}
