/*Program to get the first letter of each word in a string using regex*/
import java.util.regex.*;
import java.util.Scanner;
public class FirstLetterOfWordInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
        Matcher m = p.matcher(s);
        
        System.out.println("First letter of each word from string \"" + s + "\" : ");
        while (m.find())
            System.out.print(m.group() + " ");
		
		sc.close();
	}

}
