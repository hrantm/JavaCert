package concurrency;

public class Test {

	public static void main(String[] args) {
		Thread2 a = new Thread2("a");
		Thread2 b = new Thread2("b");
		Thread2 c = new Thread2("c");
		Thread2 d = new Thread2("d");
		
		Thread w = new Thread(a);
		Thread x = new Thread(b);
		Thread y = new Thread(c);
		Thread z = new Thread(d);
		w.start();
		x.start();
		y.start();
		z.start();
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