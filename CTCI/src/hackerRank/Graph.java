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
	
	public boolean hasPathDFS(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
//		if(s.adjacent.contains(d)){
//			return true;
//		}else {
//			while(!s.adjacent.isEmpty()){
//				Node c = s.adjacent.removeFirst();
//				return hasPathDFS(c.id, destination);
//			}
//		}
		HashSet<Integer> visited = new HashSet<>();
	}

}
