package ch8;


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
	
	static Color[][] screen = {
			{Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W},
			{Color.W, Color.W, Color.B, Color.B, Color.B, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.W, Color.W, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.W, Color.W, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.W, Color.W, Color.B, Color.W},
			{Color.W, Color.W, Color.B, Color.B, Color.B, Color.B, Color.W},
			{Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W},
			{Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W},
			
			
	};


	public static void main(String[] args) {
		ArrayList<Box> list = new ArrayList<>();
		list.add(new Box(6, 5, 8));
		list.add(new Box(10, 10, 12));
		list.add(new Box(5, 4, 7));
		list.add(new Box(8, 7, 10));
		list.add(new Box(7, 6, 9));
		list.add(new Box(9, 9, 11));
		list.add(new Box(15, 15, 14));
		list.add(new Box(18, 9, 11));
		list.add(new Box(20, 4, 0));
		list.add(new Box(45, 9, 1));
		Collections.shuffle(list);
		System.out.println(Boxes.createStack(list));
		
	}
}









