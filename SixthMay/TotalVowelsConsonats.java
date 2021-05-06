//Program to count the total number of vowels and consonants in a string
import java.util.Scanner;

public class TotalVowelsConsonats {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string:");
		String str=sc.next();
		
		str = str.toLowerCase();    
        
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount); 
        sc.close();
	}
}
