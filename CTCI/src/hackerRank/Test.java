package hackerRank;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		BMaxHeap maxHeap = new BMaxHeap();
		maxHeap.add(10);
		maxHeap.add(15);
		maxHeap.add(20);
		maxHeap.add(6);
		System.out.println(maxHeap);
		maxHeap.getMin();
		System.out.println(maxHeap);
	}
}

