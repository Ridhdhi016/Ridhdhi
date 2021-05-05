/*Program to find number is prime number*/
import java.util.Scanner;
public class CheckPrime {
	
	public static void CheckForPrime(int n)
	{
		int flag=0;
		if(n==0 || n==1)
		{
			System.out.println(n + " is not prime number");
			flag=1;
		}
		else
		{
			int m=n/2;
			for(int i=2; i<=m; i++)
			{
				if(n%i==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(n + " is prime number");
			else
				System.out.println(n + " is not prime number");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		CheckForPrime(num);
		sc.close();
	}
}
