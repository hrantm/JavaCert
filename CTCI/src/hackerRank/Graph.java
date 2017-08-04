package hackerRank;

import java.util.*;

public class Graph {
	private HashMap<Integer, Node> nodeLookUp= new HashMap<>();
	
	private int[][] matrix;
	public Graph(int size){
		matrix = new int[size][size];
	}
	
	public static class Node{
		private int id;
		LinkedList<Node> adjacent = new LinkedList<>();
		private Node(int id){
			this.id = id;
		}
	}
	
	private Node getNode(int id){
		return nodeLookUp.get(id);
	}
	
	public void addEdge(int source, int dest){
		Node s = getNode(source);
		Node d = getNode(dest);
		s.adjacent.add(d);
	}
	
	public boolean hasPathBFS(int source, int destination){
		return true;
	}
	
	public boolean hasPathDFS(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<>();
		return hasPathDFS(s, d, visited);
	}
	
	public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
		if(visited.contains(source.id)){
			return false;
		}
		visited.add(source.id);
		
		if(source == destination){
			return true;
		}
		
		for(Node child : source.adjacent){
			if(hasPathDFS(child, destination, visited)){
				return true;	
			}
		}
		
		return false;
		
	}

}
