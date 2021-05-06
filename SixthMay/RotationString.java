//Program to determine whether one string is a rotation of another
import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first string:");
		String str=sc.next();
		
		System.out.println("Enter second string:");
		String str1=sc.next();
		
		if(str.length() != str1.length())
        {
            System.out.println("second string is not rotated version of first string");
        }
        else
        {
 
            String str2 = str + str1;
  
            if(str2.contains(str1))
            {
                System.out.println("second string is rotated version of first string");
            }
            else
            {
                System.out.println("second string is not rotated version of first string");
            }
	    }
		sc.close();
	}
}
