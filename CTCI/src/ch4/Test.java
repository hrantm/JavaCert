package ch4;

public class Test {

	public static void main(String[] args) {
		Graph<String> graph = new Graph<>();
		graph.addNode("Y", "Yerevan");
		graph.addNode("L", "London");
		graph.addNode("NY", "New York");
		graph.addNode("LA", "Los Angeles");
		graph.addNode("P", "Paris");

		graph.addEdge("Y", "L", 5);
		graph.addEdge("Y", "NY", 10);
		graph.addEdge("Y", "LA", 6);
		
		
		graph.addEdge("LA", "P", 6);
		
		
	}
	
	
}
