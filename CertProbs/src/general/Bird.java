package general;

public class Bird extends Animal{
	private String name;
	
	public Bird(){
		
	}
	
	public Bird(int i){
		super();
	}
	
	public Bird(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void print(){
		System.out.println("Bird Print");
	}
	
	public String stringTest(){
		return "Bird";
	}
}
