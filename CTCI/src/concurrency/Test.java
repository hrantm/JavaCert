package concurrency;

public class Test {

	public static void main(String[] args) {
		myThread a = new myThread();
		myThread b = new myThread();
		myThread c = new myThread();
		myThread d = new myThread();
		System.out.println("main");
		a.start();
		b.start();
		c.start();
		d.start();
	}
}

class myThread extends Thread{
	public static int count;
	public void run(){
		System.out.println(count);
		count++;
	}
}