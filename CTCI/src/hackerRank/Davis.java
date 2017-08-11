package hackerRank;
import java.util.*;

public class Davis {

	public static int staircase(int num){
		HashMap<Integer, Integer> map = new HashMap<>();
		return staircase(num, map);
	}
	
	private static int staircase(int num, HashMap<Integer, Integer> map){
		if(num < 1){
			return 0;
		}
		if(map.containsKey(num)){
			return map.get(num);	
		}
		return 5;
	}
}
