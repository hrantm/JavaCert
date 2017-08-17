package ch4;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Node<Integer> head = buildBST(new int []{1,2,3,4,5,6,7});
		System.out.println(head);	
	}
	
	public static Node<Integer> buildBST(int [] arr){
		return buildBST(arr, 0, arr.length - 1);
	}
	
	public static Node<Integer> buildBST(int[] arr, int start, int end){
		if(end < start){
			return null;
		}
		
		int mid = (end + start) / 2;
		
		Node<Integer> node = new Node(arr[mid]);
		node.left = buildBST(arr, 0, mid - 1);
		node.right = buildBST(arr, mid + 1, end);
		return node;
	
		
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
