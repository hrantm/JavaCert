package ch8;

public class Paint {
	
	public static boolean fillPaint(Color[][] screen, int row, int col, Color ncolor){
		if(screen[row][col] == ncolor){
			return false;
		}
		return true;
	}

}


enum Color{
	B, W, R, Y, G;
}
