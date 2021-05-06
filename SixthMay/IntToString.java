/*Program to convert the given integer values to the string*/
import java.util.*;
public class IntToString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any integer: ");
		int num = sc.nextInt();
		
		System.out.println("Basic Type: " + ((Object)num).getClass().getSimpleName());
		
		System.out.println("Converted Type: " + Integer.toString(num).getClass().getSimpleName());
		sc.close();
	}
}
