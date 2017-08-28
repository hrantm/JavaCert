package ch8;
import java.util.*;

public class Sets {
	
	public static ArrayList<String> printPerms(String s){
		ArrayList<String> list = new ArrayList<>();
		HashMap<Character, Integer> map = buildFreqTable(s);
		printPerms(map, "", s.length(), list);
		
		return list;
	}
	
	public static void printPerms(HashMap<Character, Integer> map, String prefix, int remaining, ArrayList<String> result){
		
	}
	
	public static HashMap<Character, Integer> buildFreqTable(String s){
		HashMap<Character, Integer> table = new HashMap<>();
		for(char c : s.toCharArray()){
			if(!table.containsKey(c)){
				table.put(c, 0);
			}
			table.put(c, table.get(c) + 1);
		}
		return table;
	
	}
	
	
	
	public static HashSet<String> permString(String s){
		HashSet<String> set = new HashSet<>();
		if(s.length() <= 1){
			set.add(s);
			return set;
		}
		String last = new Character(s.charAt(s.length() - 1)).toString();
		HashSet<String> prevPerms = permString(s.substring(0,  s.length() - 1));
		
		for(String sub : prevPerms){
			for(int i = 0; i <= sub.length(); i++){
				StringBuilder newSub = new StringBuilder(sub);
				newSub.insert(i, last);
				set.add(newSub.toString());
			}
		}
		
		return set;
		
	}

	
	
	
	public static ArrayList<ArrayList<Integer>> perms(ArrayList<Integer> list){
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if(list.size() <= 1){
			res.add(list);
			return res;
		}
		
		Integer last = list.remove(list.size() - 1);
		ArrayList<ArrayList<Integer>> prevPerms = perms(list);
		for(ArrayList<Integer> sub : prevPerms){
			for(int i = 0; i < sub.size(); i++){
				ArrayList<Integer> newSub = (ArrayList<Integer>) sub.clone();
				newSub.add(last);
				swap(newSub, i, newSub.size() - 1);
				res.add(newSub);
			}
			ArrayList<Integer> newSub = (ArrayList<Integer>) sub.clone();
			newSub.add(last);
			res.add(newSub);

		}
		return res;
	}
	
	public static void swap(ArrayList<Integer> list, int i, int j){
		int temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}
	
	
	public static ArrayList<ArrayList<Integer>> subSets(ArrayList<Integer> list){
		if(list.size() == 0){
			ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
			res.add(new ArrayList<Integer>());
			return res;
		}
		
		Integer last = list.remove(list.size() - 1);
		
		
		ArrayList<ArrayList<Integer>> prevList = subSets(list);
		ArrayList<ArrayList<Integer>> newSubs = new ArrayList<>();
		
		for(ArrayList<Integer> prevSub : prevList){
			ArrayList<Integer> sub = new ArrayList<>();
			for(Integer s : prevSub){
				sub.add(s);
			}
			newSubs.add(sub);
		}
		
		
		for(ArrayList<Integer> sub : newSubs){
			sub.add(last);
		}
		for(ArrayList<Integer> newSub : newSubs){
			prevList.add(newSub);
		}
		
		
		return prevList;
	}

}
