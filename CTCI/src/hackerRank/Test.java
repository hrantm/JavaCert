package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
		int [] arr = {2,2,4,3,};
		IceCream.flavors(4, arr);
	}
	
}


enum Speed{
	FAST(2),
	FASTER(3),
	SLOW(1);
	
	public final int speed;
	
	Speed(int code){
		this.speed = code;
	}
} 

