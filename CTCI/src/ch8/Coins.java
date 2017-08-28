package ch8;

public class Coins {

	
	public static long makeChangeHR (int amount){
		int coins[] = {25, 10, 5, 1};
		return makeChange(amount, coins, 0);

	}
	
	public static long makeChangeHR(int[] coins, int money, int index){
		if(money == 0){
			return 1;
		}
		
		if(index >= coins.length){
			return 0;
		}
		
		int amountWithCoin = 0;
		long ways = 0;
		while(amountWithCoin <= money){
			int remaining = money - amountWithCoin;
			ways += makeChangeHR(coins, remaining, index + 1);
			amountWithCoin += coins[index];
		}
		
		return ways;
	}

	
	
	public static int makeChange(int amt){
		int denoms[] = {25, 10, 5, 1};
		return makeChange(amt, denoms, 0);
	}
	
	
	
	public static int makeChange(int amt, int[] denoms, int index){
		if(index >= denoms.length - 1){
			return 1;
		}
		
		int ways = 0;
		int denomAmt = denoms[index];
		
		for(int i = 0; amt - i * denomAmt >= 0; i++){
			int remainder = amt - i * denomAmt;
			ways += makeChange(remainder, denoms, index + 1);
		}
		
		return ways;
	}
	
//	public static int makeChange(int amt){
//		if(amt == 0){
//			
//			return 1;
//		}
//		
//		if(amt < 0){
//			return 0;
//		}
//		
//				
//		return makeChange(amt - 25) + makeChange(amt - 10) + makeChange(amt - 5) + makeChange(amt - 1);
//	}
	
//	public static int makeChange(int amt, int[] denoms, int index){
//		if(index >= denoms.length - 1){
//			return 1;
//		}
//		
//		int denomAmt = denoms[index];
//		
//		int ways = 0;
//		
//		for(int i = 0; i * denomAmt <= amt; i++){
//			int remainder = amt - i * denomAmt;
//			ways += makeChange(remainder, denoms, index + 1);
//		}
//		
//		return ways;
//	}
}
