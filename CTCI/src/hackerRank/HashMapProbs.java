package hackerRank;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapProbs {

	public void ransomNote(String[] ransom, String[] magazine){
		boolean res = true;
		HashSet<String> set = new HashSet<>();
		for(String key : magazine){
			set.add(key);
		}
		for(String key : ransom){
			if(!set.contains(key)){
				res = false;
				break;
			}
		}
		if(res == true){
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}