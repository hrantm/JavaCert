package ch2;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
//		Node one = createList();
//		printList(head);
//		ListSum.backwardSum(head);
		System.out.println("----------------");
		printList(head);
		
	}
	
	public static void printList(Node head){
		Node current = head;
		while(current != null){
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public static Node createList(int [] arr){
		
	}
}
