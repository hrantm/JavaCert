package aAProbs;

public class CapitalizeWords {
	
	public static String capWords(String str){
		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		return str;
	}
	
	
}
