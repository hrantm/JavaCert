package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
		int[][] matrix = {
				{1,1,0,0},
				{0,1,1,0},
				{0,0,1,0},
				{1,0,0,0}
		};
		System.out.println(ConnectedGrid.regionGrid(matrix, 4, 4));
	}
	
}


enum Speed{
	FAST(2),
	FASTER(3),
	SLOW(1);
	
	public final int speed;
	
	Speed(int code){
		this.speed = code;
	}
} 

