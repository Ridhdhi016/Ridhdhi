//Program to display all running thread
public class RunningThread extends Thread {
	public void run() {
		System.out.println("running thread name: "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		RunningThread r1=new RunningThread();
		RunningThread r2=new RunningThread();
		r1.start();
		r2.start();
	}
}