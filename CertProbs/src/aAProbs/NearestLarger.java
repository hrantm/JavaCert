package aAProbs;
import java.util.*;

public class NearestLarger {
	public static int nearest(int [] arr, int k){
		int i = k - 1;
		int j = k + 1;
		
		while(i >= -1){
			if(i == -1){break;}
			if(arr[i] > arr[k]){
				break;
			}
			i--;
		}
		
		return i;
	}
}
