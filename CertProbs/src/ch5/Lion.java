package ch5;

public class Lion extends Animal{


	public void roar(){
		 System.out.println("This " + super.getAge() + " year old lion says ROAR");
	 }
	 
	 public int getAge(){
		 return 5;
	 }
	 
}