package sectionTests;

public class DataTypes {

	char c;
	static int y = 10;
	
	public void charTest(){
		System.out.println(c);
	}
	
	public void localVarTest(){
		int y = 5;
		final int x;
		x = 10;
		System.out.println(x + y);
		
	}
	
	public void truthTest(){
		int y;
		if(go(10)){
			y = 3;
		} 
		
	}
	
	public boolean go(int y){
//		if( y > 5){
//			return true;
//		}else{
//			return false;
//		}
		return true;
	}
}
