/*Program to reverse the number*/
import java.util.Scanner;
public class ReverseNumber {

	public static void ReverseOfNumber(int n)
	{
		int temp=n,r,reverse=0;
		while(n>0)
		{
			r = n%10;
			reverse = (reverse*10)+r;
			n = n/10;
		}
		System.out.println("Reverse of " + temp + " is " + reverse);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		ReverseOfNumber(num);
		sc.close();
	}
}
