/*Program to find factorial of the number*/
import java.util.Scanner;
public class Factorial {

	public static int FindFactorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*FindFactorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " is " + FindFactorial(num));
		sc.close();
	}
}
