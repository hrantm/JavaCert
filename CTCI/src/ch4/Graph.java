package ch4;
import java.util.*;

public class Graph<T> {
	private HashMap<String, Node<T>> nodeMap = new HashMap<>();
	
	public T getNodeData(String label){
		return nodeMap.get(label).data;
	}
	
	public HashSet<Edge> getNodeInEdges(String label){
		return nodeMap.get(label).inEdges;
	}
	
	public HashSet<Edge> getNodeOutEdges(String label){
		return nodeMap.get(label).outEdges;
	}
	
	public void addEdge(String label1, String label2, int weight){
		Node<T> node1 = nodeMap.get(label1);
		Node<T> node2 = nodeMap.get(label2);
		Edge inEdge = new Edge(label1, weight);
		Edge outEdge = new Edge(label2, weight);
		node1.outEdges.add(outEdge);
		node2.inEdges.add(inEdge);
	}
	
	public void addNode(String label, T data){
		Node<T> node = new Node<>(data);
		nodeMap.put(label, node);
	}
	
	public class Node<T>{
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
