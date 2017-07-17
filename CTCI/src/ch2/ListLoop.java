package ch2;

public class ListLoop {

	public static boolean isIntersect(Node node1, Node node2){
		boolean res = true;
		int oneSize = listLength(node1);
		int twoSize = listLength(node2);
		System.out.println(oneSize);
		System.out.println(twoSize);
		return res;
	}
	
	public static int listLength(Node node){
		int count = 0;
		Node current = node;
		while(current != null){
			count++;
			current = current.getNext();
		}
		return count;
	}
}
