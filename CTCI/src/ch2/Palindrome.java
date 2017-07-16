package ch2;

public class Palindrome {

	public static boolean check1(Node node){
		boolean res = true;
		Node nodeRev = ListSum.reverseList(node);
		while(node != null){
			if (node.getData() != nodeRev.getData()) {
				res = false;
				break;
			}
			node = node.getNext();
			nodeRev = nodeRev.getNext();
		}
		return res;
	} 
}
