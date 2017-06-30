package ch1;

import java.util.*;
import java.util.Collections;


public class CheckPerm {
	
	public static boolean checkSort(String str1, String str2){
		boolean res = false;
		
		List<String> list1 = Arrays.asList(str1.split(""));
		List<String> list2 = Arrays.asList(str2.split(""));
		Collections.sort(list1);
		Collections.sort(list2);
		
		if(list1.equals(list2)){
			res = true;
		}
		
		return res;
	}
}
