package aAProbs;
import java.util.*;

public class ThirdGreatest {
	
	public static int getThird(ArrayList<Integer> arr){
		int first = arr.get(0);
		int second = arr.get(1);
		int third = arr.get(2);
		for(int i = 3; i < arr.size(); i++) {
			int current = arr.get(i);
			if(current > first){
				third = second;
				second = first;
				first = current;
			}else if(current > second) {
				third = second;
				second = current;
			} else if (current > third) {
				third = current;
			}
		}
		return third;
	}
}
