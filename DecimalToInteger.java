/*Program to convert the given decimal number into integer*/
import java.util.Scanner;
public class DecimalToInteger {

	public static void main(String[] args) {
		double dvalue;
		int ivalue;
		System.out.print("Enter Decimal Value:");
		Scanner sc=new Scanner(System.in);
		dvalue=sc.nextDouble();
		ivalue=(int)dvalue;
		System.out.println(ivalue);
	}
}
