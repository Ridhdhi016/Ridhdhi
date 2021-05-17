//Program to set priorities of thread
public class SetPriorities extends Thread {
	public void run() {
		System.out.println("priority of "+Thread.currentThread().getName() + " has "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		SetPriorities s1=new SetPriorities();
		SetPriorities s2=new SetPriorities();
		SetPriorities s3=new SetPriorities();
		
		s1.setPriority(Thread.MAX_PRIORITY);
		s2.setPriority(Thread.MIN_PRIORITY);
		s3.setPriority(Thread.NORM_PRIORITY);
		
		s1.start();
		s2.start();
		s3.start();
	}
}