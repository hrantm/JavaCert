package ch3;


public class Test {
	
	final static int i;
	
	
	static {i = 5;}
	
	public static void main(String[] args){
		System.out.println(new Test().i);
	}
	
}
