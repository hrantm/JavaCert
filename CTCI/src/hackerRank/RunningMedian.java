package hackerRank;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {

	public static double[] getMedians(int [] arr){
		PriorityQueue<Integer> lowers = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b){
				return -1 * a.compareTo(b);
			}
		});
		
		PriorityQueue<Integer> highers = new PriorityQueue<>();
		double[] medians = new double[arr.length];
		for(int i = 0; i < arr.length; i++){
			int number = arr[i];
			addNumber(number, lowers, highers);
			rebalance(lowers, highers);
			medians[i] = getMedian(lowers, highers);
		}
		return medians;
	}
	
	public static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
		if(lowers.isEmpty() || number < lowers.peek()){
			lowers.add(number);
		}else {
			highers.add(number);
		}
	}
	
	public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
		
		if(biggerHeap.size() - smallerHeap.size() >= 2){
			smallerHeap.add(biggerHeap.poll());
		}
	}
	
	public static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
		if(biggerHeap.size() == smallerHeap.size()){
			return ((double)biggerHeap.peek() + smallerHeap.peek()) / 2;
		}else {
			return biggerHeap.peek();
		}
	}

	
}
