package aAProbs;

public class Palindrome {
	public static boolean isPalindrome(String str){
		if(str.equals(StringReverse.reverseIP(str))){
			return true;
		}else {
			return false;
		}
	}
}