package cache;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) throws Exception{
		HashMap<String, Integer> map = new HashMap<>(3);
		map.set("first", 10);
		map.set("third", 30);
		map.set("fourth", 50);
		map.set("third", 200);
		System.out.println(map);
	}

}
