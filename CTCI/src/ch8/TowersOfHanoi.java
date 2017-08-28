package ch8;
import java.util.*;

public class TowersOfHanoi {
	
	Tower t1;
	Tower t2;
	Tower t3;
	
	public void moveDisks(int n, Tower beg, Tower aux, Tower dest){
		
	}
	
	public TowersOfHanoi(int n){
		buildTowers(n);
	}
	
	public void buildTowers(int n){
		t1 = new Tower();
		t2 = new Tower();
		t3 = new Tower();
		
		while(n > 0){
			t1.add(new Disk(n));
			n--;
		}
	}
}

class Tower{
	private Stack<Disk> stack = new Stack<>();
	
	public Disk get(){
		return stack.pop();
	}
	
	public void add(Disk disk){
		stack.push(disk);
	}
	
	public String toString(){
		return this.stack.toString();
	}
}

class Disk{

	Integer size;
	public Disk(int size){
		this.size = size;
	}
	
	public String toString(){
		return this.size.toString();
	}
}
