package hackerRank;

public class Test {
	
	public static void main(String[] args) {
		StringProbs stringProbs = new StringProbs();
		HashMapProbs mapProbs = new HashMapProbs();
		mapProbs.ransomNoteMap(
				new String[]{"two", "times", "two", "is", "four"}, 
				new String[]{"two", "times", "three", "is", "not", "four"});
	}
}
