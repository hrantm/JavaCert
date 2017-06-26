package aAProbs;
import java.util.*;

public class MostCommonLetter {
	
	public static HashMap<Character, Integer> mostCommon(String str){
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if(counter.containsKey(current)) {
				Integer currentCount = counter.get(current);
				counter.put(current, ++currentCount);
			}else {
				counter.put(current, 1);
			}
		}
		
		return counter;
	}
	
	public static Character getMaxChar(HashMap<Character, Integer> map) {
		return 'a';
	}
	
}
