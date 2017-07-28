package hackerRank;

public class Sorting {
	
	public static void mergeSort(int [] arr ){
		
	}
	
	
	public static int bubbleSort(int [] arr){
		int swaps = 0;
		int times = arr.length;
		boolean sorted = false;
		while(times > 0){
			sorted = true;
			for(int i = 0; i < arr.length - 1; i++){
				if(arr[i] > arr[i + 1]){
					sorted = false;
					exch(arr, i, i+1);
					swaps++;
				}
			}
			
			if(sorted){break;}
			times--;
		}
		return swaps;
	}
	
	public static void exch(int [] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}
