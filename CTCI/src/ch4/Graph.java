package ch4;
import java.util.*;

public class Graph<T> {
	private HashMap<String, Node<T>> nodeMap = new HashMap<>();
	
	public Node<T> getNode(String label){
		return nodeMap.get(label);
	}
	
	public void addNode(String label, T data){
		Node<T> node = new Node<>(data);
		nodeMap.put(label, node);
	}
	
	class Node<T>{
		T data;
		HashSet<Edge> inEdges = new HashSet<>();
		HashSet<Edge> outEdges = new HashSet<>();
		
		public Node( T data){
			this.data = data;
		}
		
		public String toString(){
			return data == null ? "null" : data.toString();
		}
	}
	
	class Edge{
		String destLabel;
		int weight;
		
		public Edge(String destLabel, int weight){
			this.destLabel = destLabel;
			this.weight = weight;
		}
	}
	
	public String toString(){
		return nodeMap.toString();
	}

}
