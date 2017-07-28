package hackerRank;

public class Sorting {
	
	public static void mergeSort(int [] arr ){
		
	}
	
	public static int[] merge(int [] arr1, int [] arr2){
		int [] res = new int [arr1.length + arr2.length];
		int k = 0;
		int i = 0;
		int j = 0;
		while(i < arr1.length && j < arr2.length){
			if(arr1[i] <= arr2[j]){
				res[k] = arr1[i];
				k++;
				i++;
			}else if(arr1[i] > arr2[j]){
				res[k] = arr2[j];
				k++;
				j++;
			}
		}
		for(; i < arr1.length; i++){
			res[k] = arr1[i];
			k++;
		}
		
		for(; j < arr2.length; j++){
			res[k] = arr2[j];
			k++;
		}
		
		return res;
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
