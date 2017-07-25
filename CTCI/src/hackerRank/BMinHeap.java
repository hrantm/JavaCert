package hackerRank;

import java.util.Arrays;

public class BMinHeap {
	private int size = 0;
	private int capacity = 10;
	private int[] items = new int[capacity];

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private boolean hasLeftChild(int parentIndex) {
		return getLeftChildIndex(parentIndex) < size;
	}

	private boolean hasRightChild(int parentIndex) {
		return getRightChildIndex(parentIndex) < size;
	}

	private boolean hasParent(int childIndex) {
		return getParentIndex(childIndex) >= 0;
	}

	private int leftChild(int parentIndex) {
		return items[getLeftChildIndex(parentIndex)];
	}

	private int rightChild(int parentIndex) {
		return items[getRightChildIndex(parentIndex)];
	}

	private int parent(int childIndex) {
		return items[getParentIndex(childIndex)];
	}

	private void swap(int i, int j) {
		int temp = items[i];
		items[i] = items[j];
		items[j] = temp;
	}

	private void ensureExtraCapacity() {
		if (size == capacity) {
			items = Arrays.copyOf(items, 2 * capacity);
			capacity *= 2;
		}
	}
	
	public int peek(){
		if(size == 0){throw new IllegalStateException("Empty Heap");}
		return itesm[0];
		
	}

}