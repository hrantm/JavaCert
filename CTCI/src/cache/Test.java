package cache;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) throws Exception{
		IntSet set = new IntSet(3);
		set.insert(5);
		set.insert(7);
		set.insert(3);		
//		set.insert(6);		
				
		System.out.println(set);
	}

}
