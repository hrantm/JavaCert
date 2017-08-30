package ch8;

public class BooleanEvaluation {
	

	public static int evaluate(String s, boolean result){

		if(s.length() == 0){
			return 0;
		}
		
		if(s.length() == 1){
			return evalString(s) == result ? 1 : 0;
		}
		
		int ways = 0;
		
		for(int i = 1; i < s.length(); i += 2){

			char c = s.charAt(i);
			String left = s.substring(0, i);
			String right = s.substring(i + 1, s.length());
			
			int leftTrue = evaluate(left, true);
			int leftFalse = evaluate(left, false);
			
			int rightTrue = evaluate(right, true);
			int rightFalse = evaluate(right, false);
			
			int total = (leftTrue + leftFalse) * (rightTrue + rightFalse); 
			  

			int totalTrue = 0;
			if(c == '^'){
				totalTrue = leftTrue * rightFalse + rightTrue * leftFalse;
			}else if(c == '&'){
				totalTrue = leftTrue * rightTrue;
			}else if (c == '|'){
				totalTrue = leftTrue * rightTrue + leftTrue * rightFalse + rightTrue * leftFalse;
			}
			
			int subways = result ? totalTrue : total - totalTrue;
			ways += subways;
		}
		
		return ways;
		
	}
	
	public static boolean evalString(String s){
		return s.equals("1") ? true : false;
	}

}
