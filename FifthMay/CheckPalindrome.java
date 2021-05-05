/*Program to find number is palindrome number*/
import java.util.Scanner;
public class CheckPalindrome {

	public static void CheckForPalindrome(int n)
	{
		int r,temp=n,rev=0;
		while(n>0)
		{
			r = n%10;
			rev = (rev*10)+r;
			n = n/10;
		}
		if(temp==rev)
			System.out.println(temp + " is palindrome");
		else
			System.out.println(temp + " is not palindrome");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		CheckForPalindrome(num);
		sc.close();
	}
}
