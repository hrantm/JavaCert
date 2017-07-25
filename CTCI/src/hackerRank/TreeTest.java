package hackerRank;


public class TreeTest {
	
	public boolean checkBST(Node node){
		
		return (checkBST(node.left, node.data, null) && checkBST(node.right, null, node.data));
		
	}
	
	public boolean checkBST(Node node, Integer max, Integer min){
		if(node.data < max && node.data > min){
			return (checkBST(node.left, node.data, null) && checkBST(node.right, null, node.data));
		}else {
			return false;
		}
		
	}


}

class Node {
    int data;
    Node left;
    Node right;
 }
