package concurrency;

public class Test {

	public static void main(String[] args) {
		
		
	}
}

class Thread2 implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class myThread extends Thread{
	public static int count;
	public void run(){
		System.out.println(count);
		count++;
	}
}