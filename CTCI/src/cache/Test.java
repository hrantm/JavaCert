package cache;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) throws Exception{
		IntSet set = new IntSet(4);
		set.insert(3);
		set.insert(7);
		set.insert(4);
		System.out.println(set);
	}

}
