package ch4;
import java.util.*;

public class Graph<T> {
	
	
	private class Node<T>{
		String label;
		T data;
		HashSet<Edge> inEdges = new HashSet<>();
		HashSet<Edge> outEdges = new HashSet<>();
		
		public Node(String label, T data){
			this.label = label;
			this.data = data;
		}
	}
	
	private class Edge{
		String destLabel;
		int weight;
		
		public Edge(String destLabel, int weight){
			this.destLabel = destLabel;
			this.weight = weight;
		}
	}

}
