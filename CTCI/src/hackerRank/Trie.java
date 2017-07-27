package hackerRank;

import java.util.HashMap;

public class Trie{

	TrieNode head = new TrieNode();
	
	public void addNode(String str){
		TrieNode node = getNode(str);
		System.out.println(node);
	}
	
	public TrieNode getNode(String str){
		TrieNode res = head;
		return res;
	}
	
	private TrieNode getNode(TrieNode node, Character c){
		TrieNode res = null;
		if(node.children.containsKey(c)){
			res = node.children.get(c);
		}
		return res;
	}
	
}

class TrieNode{
	Character data;
	boolean isCompleteWord = false;
	HashMap<Character, TrieNode> children = new HashMap<>();
	
	public TrieNode(Character data){
		this.data = data;
	}
	
	public String toString(){
		return data.toString();
	}
}
