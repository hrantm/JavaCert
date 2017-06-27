package aAProbs;

public class Primes {

	public static boolean isPrime(int num){
		double dubNum = (double ) num;
		boolean retVal = true;
		for(int i = 2; i <= Math.sqrt(dubNum); i++){
			if(num % i == 0){
				retVal = false;
				break;
			}
		}
		return retVal;
	}
}
