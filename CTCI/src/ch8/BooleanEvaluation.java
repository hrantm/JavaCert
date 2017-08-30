package ch8;
import java.util.*;

public class BooleanEvaluation {
	
	public static int countEval(String s, boolean result){
		HashMap<String, Integer> map = new HashMap<>();
		return countEval(s, result, map);
	}	
	public static int countEval(String s, boolean result, HashMap<String, Integer> map){
		if(s.length() == 0){
			return 0;
		}
		
		if(s.length() == 1){
			return evalString(s) == result ? 1 : 0;
		}
		
		if(map.containsKey(result + s)){
			return map.get(result + s);
		}
		
		int ways = 0;
		
		for(int i = 1; i < s.length(); i+= 2){
			char c = s.charAt(i);
			String left = s.substring(0, i);
			String right = s.substring(i + 1, s.length());
			
			int leftTrue = countEval(left, true, map);
			int leftFalse = countEval(left, false, map);
			
			int rightTrue = countEval(right, true, map);
			int rightFalse = countEval(right, false, map);
			
			int total = (leftTrue + leftFalse) * (rightTrue + rightFalse);
			
			int totalTrue = 0;
			if(c == '^'){
				totalTrue += leftTrue * rightFalse + leftFalse * rightTrue; 
			}else if(c == '&'){
				totalTrue += leftTrue * rightTrue;
			}else if (c == '|'){
				totalTrue += leftTrue * rightFalse + leftFalse * rightTrue + leftTrue * rightTrue;
			}
			
			int subWays = result ? totalTrue : total - totalTrue;
			ways += subWays;
		}
		
		map.put(result + s, ways);
		return ways;
	}
	
	public static boolean evalString(String s){
		return s.equals("1") ? true : false;
	}

	
//	public static int evaluate(String s, boolean result){
//		HashMap<String, Integer> memo = new HashMap<>();
//		return evaluate(s, result, memo);
//	}
//
//	public static int evaluate(String s, boolean result, HashMap<String, Integer> memo){
//
//		if(s.length() == 0){
//			return 0;
//		}
//		
//		if(s.length() == 1){
//			return evalString(s) == result ? 1 : 0;
//		}
//		
//		if(memo.containsKey(result + s)){
//			return memo.get(result + s);
//		}
//		
//		int ways = 0;
//		
//		for(int i = 1; i < s.length(); i += 2){
//
//			char c = s.charAt(i);
//			String left = s.substring(0, i);
//			String right = s.substring(i + 1, s.length());
//			
//			int leftTrue = evaluate(left, true);
//			int leftFalse = evaluate(left, false);
//			
//			int rightTrue = evaluate(right, true);
//			int rightFalse = evaluate(right, false);
//			
//			int total = (leftTrue + leftFalse) * (rightTrue + rightFalse); 
//			  
//
//			int totalTrue = 0;
//			if(c == '^'){
//				totalTrue = leftTrue * rightFalse + rightTrue * leftFalse;
//			}else if(c == '&'){
//				totalTrue = leftTrue * rightTrue;
//			}else if (c == '|'){
//				totalTrue = leftTrue * rightTrue + leftTrue * rightFalse + rightTrue * leftFalse;
//			}
//			
//			int subways = result ? totalTrue : total - totalTrue;
//			ways += subways;
//		}
//		
//		memo.put(result + s, ways);
//		
//		return ways;
//		
//	}
//	

}
