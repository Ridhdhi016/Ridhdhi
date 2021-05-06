/*Program to round off the given decimal number and store into String*/
import java.util.Scanner;
public class RoundOfDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Decimal Number: ");
		double number = sc.nextDouble();
		
		String n = String.valueOf(Math.round(number));
		System.out.println("Round off value:" + n);
		
		sc.close();
	}
}
