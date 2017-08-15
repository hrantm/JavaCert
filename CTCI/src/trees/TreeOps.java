package trees;

import java.util.Stack;

public class TreeOps {
	
	public static void preOrderTraversal(Node<Integer> node){
		if(node != null){
			System.out.println(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public static void preOrderStack(Node<Integer> node){
		Stack<Node<Integer>> stack = new Stack<>();
	}

}
