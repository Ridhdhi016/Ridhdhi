/*Program which takes 2 arguments - a string and its length. If the length of the string is not according to given one then throw the user defined LengthMatchException and handles it appropriately.*/
import java.util.Scanner;

class LengthMatchExp extends Exception{
	LengthMatchExp(String s){
		super(s);
	}
}

public class LengthMatchException {

	public static void CheckLengthMatch(String str,int len) throws LengthMatchExp {
		int temp;
		temp=str.length();
		if(temp!=len)
		{
			throw new LengthMatchExp("\n Not valid length");
		}
		else {
			System.out.println("Valid length");
		}
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str=sc.next();
		
		System.out.println("Enter string length:");
		int len=sc.nextInt();
		
		try {
			CheckLengthMatch(str,len);
		}
		catch(Exception m) {
			System.out.println("Exception occured: "+m);
		}
		sc.close();

	}

}
