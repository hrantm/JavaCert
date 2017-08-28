package ch8;
import java.util.*;

public class Parens {
	
	public static ArrayList<String> generateParens(int n){
		ArrayList<String> parens = new ArrayList<>();
		addParens(parens, n, n, new char[n * 2], 0);
		return parens;
		
	}
	
	public static void addParens(ArrayList<String> parens, int left, int right, char[] arr, int index){
		
		if(left < 0 || right < left){
			return;
		}
		
		if(left == 0 && right == 0){
			parens.add(String.copyValueOf(arr));
		}else {
			arr[index] = '(';
			addParens(parens, left - 1, right, arr, index + 1);
			
			arr[index] = ')';
			
			addParens(parens, left, right - 1, arr, index + 1);
		}
		
		
	}

}
