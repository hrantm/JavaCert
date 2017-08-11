package hackerRank;

public class Paths {
	
	public static int count(int[][] matrix){
		
		return countMemo(0, 0, matrix);
		
	}
	
	public static int countMemo(int row, int col, int[][] matrix){
		return 4;
	}
	
	public static int countRec(int row, int col, int[][] matrix){
		if(!validPath(row, col, matrix)){
			return 0;
		}
		if(end(row, col, matrix)){
			return 1;
		}
		return countRec(row + 1, col, matrix) + countRec(row, col + 1, matrix);
		
	}
	
	public static boolean end(int row, int col, int[][] matrix){
		boolean res = false;
		if(row == matrix.length - 1 && col == matrix[0].length - 1){
			res = true;
		}
			
		return res; 
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
