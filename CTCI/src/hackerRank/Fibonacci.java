package hackerRank;

public class Fibonacci {
	
	public static int fibRec(int n){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		return fibRec(n - 1) + fibRec(n - 2);
	}

}
