package hackerRank;

import java.util.HashMap;

public class Fibonacci {
	
	public static int fibRec(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		return fibRec(n - 1) + fibRec(n - 2);
	}
	
	public static int fibMemo(int n){
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 0);
		map.put(1, 1);
		return fibMemo(n, map);
	}
	
	public static int fibMemo(int n, HashMap<Integer, Integer> map){
		return 5;
	}

}
