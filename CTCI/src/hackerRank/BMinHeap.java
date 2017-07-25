package hackerRank;

public class BMinHeap {
	private int size = 0;
	private int capacity = 10;
	private int [] items = new int[capacity];
	
	private int getLeftChildIndex(int parentIndex){
		return 2 * parentIndex + 1;
	}
	
	private int getRightChildIndex(int parentIndex){
		return 2 * parentIndex + 2;
	}
	
	private int getParentIndex(int childIndex){
		return (childIndex - 1) / 2;
	}

}
