/*Program to demonstrate calculator using switch statement*/
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		int a,b,choice=0,x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First number: ");
		a = sc.nextInt();
		
		System.out.print("Enter Second number: ");
		b = sc.nextInt();
		
		System.out.println("Enter 1-Addition\nEnter 2-Subtraction\nEnter 3-Multiplication\nEnter 4-Division\nEnter 5-Modulus");
		choice = sc.nextInt();
		
		switch(choice)
		{
		
			case 1:
				x=a+b;
				System.out.println("Addition of two numbers: " + x);
				break;
				
			case 2:
				x=a-b;
				System.out.println("Subtraction of two numbers: " + x);
				break;
				
			case 3:
				x=a*b;
				System.out.println("Multiplication of two numbers: " + x);
				break;
				
			case 4:
				x=a/b;
				System.out.println("Division of two numbers: " + x);
				break;
				
			case 5:
				x=a%b;
				System.out.println("Modulus of two numbers: " + x);
				break;
				
			default:
				System.out.println("Invalid Choice");
			
		}
		sc.close();
	}
}
