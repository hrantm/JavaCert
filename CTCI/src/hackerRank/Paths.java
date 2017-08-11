package hackerRank;

public class Paths {
	
	public static int count(int[][] matrix){
		
		return countRec(0, 0, matrix);
		
	}
	
	public static int countRec(int row, int col, int[][] matrix){
		if(!validPath(row, col, matrix)){
			return 0;
		}
		if(end(row, col)){
			return 1;
		}
		
	}
	
	public static boolean end(int row, int col, int[][] matrix){
		
	}
	
	public static boolean validPath(int row, int col, int[][] matrix){
		boolean res = true;
		if(row > matrix.length - 1 || row < 0){
			res = false;
		}else if(col > matrix[0].length - 1 || col < 0){
			res = false;
		}else if (matrix[row][col] == 0){
			res = false;
		}		
		
		return res;
	}

}