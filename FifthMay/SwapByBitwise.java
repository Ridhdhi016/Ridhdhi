/*Program to swap two numbers using bitwise operator*/
import java.util.Scanner;
public class SwapByBitwise {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		a = sc.nextInt();
		
		System.out.print("Enter Second Number:");
		b = sc.nextInt();
		
		System.out.println("Before Swapping : a=" + a + " b=" + b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swapping : a=" + a + " b=" + b);
		sc.close();
	}
}
