//Program to implement thread using runnable interface
public class ImplementThread implements Runnable{

	public void run() {
		System.out.println("Thread is Running.....");
	}
	
	public static void main(String[] args) {
		
		ImplementThread i = new ImplementThread();
		Thread t1 = new Thread(i);
		t1.start();
	}
}
