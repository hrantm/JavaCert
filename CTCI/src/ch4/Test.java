package ch4;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Node<Integer> head = buildBST(new int []{1,2,3,4,5,6,7});
			
	}
	
	public static Node<Integer> buildBST(int [] arr){
		int mid = arr.length / 2;
		Node<Integer> head = new Node<Integer>(arr[mid]);
		buildBST(head, arr, mid);
		return head;
	}
	
	public static void buildBST(Node<Integer> node, int[] arr, int i){
		
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
