package general;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Tiger extends Animal{
	
	private String name;

	public String getName(){
		return this.name;
	}
	
	public Tiger(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.println("Tiger Print");
	}
	
}
