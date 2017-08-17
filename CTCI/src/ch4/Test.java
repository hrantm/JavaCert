package ch4;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Graph<String> graph = new Graph<>();
		graph.addNode("Y", "Yerevan");
		graph.addNode("L", "London");
		graph.addNode("NY", "New York");
		graph.addNode("LA", "Los Angeles");
		graph.addNode("P", "Paris");
		
		graph.addNode("O", "Oakland");

		graph.addEdge("Y", "L", 5);
		graph.addEdge("Y", "NY", 10);
		graph.addEdge("Y", "LA", 6);
		
		
		graph.addEdge("LA", "P", 6);
		
		System.out.println(BFS("Y", "O", graph));
	}
	
	public static boolean BFS(String label1, String label2, Graph graph){
		boolean res = false;
		LinkedList<GNode> queue = new LinkedList<>();
		HashSet<GNode> visited = new HashSet<>();
		
		GNode destNode = graph.getNode(label2);
		
		queue.add(graph.getNode(label1));
		
		while(!queue.isEmpty()){
			GNode currentNode = queue.removeFirst();
			if(currentNode.data == destNode.data){
				res = true;
				break;
			}
			HashSet<Edge> edges = currentNode.outEdges;
			
			for(Edge e : edges){
				GNode currentConnection = graph.getNode(e.destLabel);
				queue.addLast(currentConnection);
			}
		}
		
		return res;
	}
}
