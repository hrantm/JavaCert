package concurrency;

public class Test {

	public static void main(String[] args) {
		
	}
}

class Thread2 implements Runnable{
	String name;
	public Thread2(String name){
		this.name = name;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	
}

class myThread extends Thread{
	public static int count;
	public void run(){
		System.out.println(count);
		count++;
	}
}