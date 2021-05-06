/*Program to check valid mobile number using reqular expression*/
import java.util.regex.*;
import java.util.Scanner;
public class CheckValidMobileNumber {
	
	public static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher m = p.matcher(s);
	    return (m.find() && m.group().equals(s));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Mobile Number: ");
		String str = sc.nextLine();

		if (isValid(str))
	        System.out.println("Valid Number");    
	    else
	        System.out.println("Invalid Number"); 
		
		sc.close();
	}
}
