/*Program to find the factors of a given numbers*/
import java.util.Scanner;
public class Factor {

	public static void factorOfNumber(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		num = sc.nextInt();
		factorOfNumber(num);
		sc.close();
	}
}
