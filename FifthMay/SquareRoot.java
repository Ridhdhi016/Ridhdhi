/*Program to Find Square Root of a Number Without sqrt Method*/
import java.util.Scanner;
public class SquareRoot {

	public static double squareRoot(int num)   
	{    
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
			t=sqrtroot;  
			sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;  
	}  
	
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");   
		Scanner sc = new Scanner(System.in);  
		int n = sc.nextInt();   
		System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
		sc.close();
	}
}
