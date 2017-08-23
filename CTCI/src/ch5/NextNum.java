package ch5;

public class NextNum {
	
	public static int getNext(int n){
		return n;
	}
	
	public static int getNextLargest(int n){
		String s = Integer.toBinaryString(n);
		int p = findFirstNonTrailingZero(s);
		int flipped = setBit(n, p);
		int zeroes = 0;
		int ones = 0;
		
		for(int i = s.length() - p; i < s.length(); i++){
			if(s.charAt(i) == '1'){
				ones++;
			}else {
				zeroes++;
			}
		}
		int clearMask = ~0 << p;
		int cleared = flipped & clearMask;
		
		System.out.println(Integer.toBinaryString(cleared));
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(flipped));
		return n;
	}
	
	public static int setBit(int n, int p){
		int mask = 1 << p;
		return n | mask;
	}
	
	public static int findFirstNonTrailingZero(String s){
		boolean b = false;
		int res = s.length() - 1;
		for(; res >= 0; res--){
			char c = s.charAt(res);
			if(!b && c == '1'){
				
				b = true;
			}
			if(b && c == '0'){
				break;
			}
		}
		return s.length() - 1 - res;
	}
	
	public static int getNextSmallest(int n){
		return n;
	}

}
