package sectionTests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
	}
	
}

class TestA{
	
	protected int weight = 3;
	private int height = 5;
	
	public int getHeight(){
		return height;
	}
	public int getWeight(){
		return weight;
	}
	
	public void method(String [] arr) throws IOException{
		
	}
	
//	public void method(String str) throws FileNotFoundException{
//		
//	}

}

class TestB extends TestA{
	public int weight = 3;
	public int height = 5;

	public void method() throws FileNotFoundException{
		
	}
}

