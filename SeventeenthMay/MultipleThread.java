//Program to creating multiple thread
public class MultipleThread extends Thread {

	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread Name: " + Thread.currentThread().getName() );
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MultipleThread m1 = new MultipleThread();
		m1.start();
		MultipleThread m2 = new MultipleThread();
		m2.start();
		MultipleThread m3 = new MultipleThread();
		m3.start();
	}
}
