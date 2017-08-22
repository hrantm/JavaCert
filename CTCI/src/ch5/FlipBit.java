package ch5;
import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class FlipBit {
	
	public static int flip(int n){
		String bString = BinaryToString.bToString(n);
		ArrayList<int[]> list = new ArrayList<>();
		int [] arr = new int[2];
		char c = bString.charAt(0);
		String s = new Character(c).toString();
		arr[0] = Integer.parseInt(s);
		arr[1] = 1;
		list.add(arr);
		for(int i = 1; i < bString.length(); i++){
			c = bString.charAt(i);
			s = new Character(c).toString();
			int val = Integer.parseInt(s);
			if(arr[0] == val){
				arr[1]++;
			}else {
				arr = new int[2];
				arr[0] = val;
				arr[1] = 1;
				list.add(arr);
			}
		}
		list.forEach(el -> System.out.println(Arrays.toString(el)));
		return n;
	}

}
