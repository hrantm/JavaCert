package ch8;
import java.util.*;

public class Queens {
	
	
	public static ArrayList<Integer []> eightQueens(int gridSize){
		ArrayList<Integer []> result = new ArrayList<>();
		Integer[] cols = new Integer[gridSize];
		eightQueens(gridSize - 1, cols, result);
		return result;
	}
	
	public static void eightQueens(int row, Integer[] cols, ArrayList<Integer[]> result){
		
	}
	
	
	public static boolean checkValid(){
		return true;
	}
}