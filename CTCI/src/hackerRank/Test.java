package hackerRank;

import java.util.*;

public class Test {
	
	
	public static void main(String[] args) {
		WeightedGraph graph = new WeightedGraph();
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		graph.addNode("E");
		
		
		graph.addEdge("A", "B", 50);
		graph.addEdge("A", "D", 80);
		
		graph.addEdge("B", "C", 60);
		graph.addEdge("B", "D", 90);
		
		graph.addEdge("C", "E", 40);
		
		graph.addEdge("D", "C", 20);
		graph.addEdge("D", "E", 70);
		
		graph.addEdge("E", "B", 50);
		
		
		System.out.println(graph.shortestPath("A", "E"));
	}
	
}


