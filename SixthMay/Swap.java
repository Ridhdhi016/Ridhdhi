/*Program to swap two string variables without using third or temp variable.*/
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First String: ");
		String a = sc.nextLine();
		
		System.out.print("Enter Second String: ");
		String b = sc.nextLine();
		
		System.out.println("Before Swap: " + a + " " + b);  
		
		a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length()); 
        
        System.out.println("After Swap: " + a + " " + b);  
        sc.close();
	}
}
