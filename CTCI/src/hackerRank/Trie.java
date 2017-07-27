package hackerRank;

import java.util.HashMap;

public class Trie {

	private TrieNode head;
	
	public Trie(){
		this.head = new TrieNode(null);
	}
	
	public TrieNode addChar(char c){
		return addChar(head, c);
	}
	
	public TrieNode getChar(char c){
		return getChar(head, c);
	}
	
	private TrieNode getChar(TrieNode node, char c){
		
		return node;
	}
	
	private TrieNode addChar(TrieNode node, char c){
		if(node.data != null && node.data == c){
			return node;
		}else if(node.children.containsKey(c)){
			return addChar(node.children.get(c), c);
		}else {
			return addNode(node, c);
		}
	}
	
	private TrieNode addNode(TrieNode node, char c){
		TrieNode newNode = new TrieNode(c);
		node.children.put(c, newNode);
		return newNode;
	}
	
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
			return "Data: null | Children: " + children.toString();
		}
		return "Data: " + data.toString() + " Children: " + children.toString();
	}
}
