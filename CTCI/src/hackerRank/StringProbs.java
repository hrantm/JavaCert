package hackerRank;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class StringProbs {

	public int numbersNeeded(String first, String second){
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		fillMap(first, map1);
		fillMap(second, map2);
		System.out.println(map1);
		System.out.println(map2);
		return 5;
	}
	
	public void fillMap(String str, HashMap<Character, Integer> map){
		for(int i = 0; i < str.length(); i++){
			Character currentChar = str.charAt(i);
			if(map.containsKey(currentChar)){
				Integer currentCount = map.get(currentChar);
				map.put(currentChar, ++currentCount);
			}else{
				map.put(currentChar, 1);
			}
		}
	}
}
