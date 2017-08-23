package ch6;

public class Primes {

	public static boolean isPrime(int n){
		if(n < 2){
			return false;
		}
		boolean res = true;
		int root = (int) Math.sqrt(n);
		for(int i = 2; i <= root; i++){
			if(n % i == 0){
				res = false;
				break;
			}
		}
		return res;
	}
}
