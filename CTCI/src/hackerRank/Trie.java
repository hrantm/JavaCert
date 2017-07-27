package hackerRank;

import java.util.HashMap;

public class Trie{

	TrieNode head = new TrieNode();
	
	TrieNode getNode(String data){
		
		return head;
	}
}

class TrieNode{
	Character data;
	boolean isCompleteWord = false;
	HashMap<Character, TrieNode> children = new HashMap<>();
}
