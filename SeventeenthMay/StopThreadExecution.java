//Program to stop thread execution with ctrl+c
import java.io.IOException;

public class StopThreadExecution implements Runnable{
	boolean Threadstarting=true;
	public void run()
    {
         try
         {
        	 while(Threadstarting)
        	 {
               System.out.println(Thread.currentThread().getName()+" is Running");
               Thread.sleep(300);
        	 }
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
    }
	public static void main(String[] args) {
		StopThreadExecution obj = new StopThreadExecution();
        Thread t = new Thread(obj);
        t.start();
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
        obj.Threadstarting = false;
	}
}