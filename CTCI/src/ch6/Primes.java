package ch6;

public class Primes {
	
	public static boolean[] primeSieve(int max){
		boolean flags[] = new boolean[max + 1];
		init(flags);
		int prime = 2;
		crossOffFlags(flags, prime);
//		while(prime <= (int) Math.sqrt(max)){
//			crossOfFlags(flags, prime);
//		}
		return flags;
	}
	
	public static void crossOffFlags(boolean[] flags, int prime){
		
	}
	
	public static void init(boolean[] flags){
		
		for(int i = 2; i < flags.length; i++){
			flags[i] = true;
		}
	}
	

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
