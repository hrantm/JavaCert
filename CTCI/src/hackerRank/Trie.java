package hackerRank;

import java.util.HashMap;

public class Trie {

}

class TrieNode{
	Character data;
	HashMap<Character, TrieNode> children;
	boolean isWord;
	
	public TrieNode(Character data){
		this.children = new HashMap<>();
		this.data = data;
	}
	
	public String toString(){
		if(data == null){
			return "null";
		}
		return data.toString();
	}
}
