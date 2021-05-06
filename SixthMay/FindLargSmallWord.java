//Program to find the largest and smallest word in a string
import java.util.Scanner;
public class FindLargSmallWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        String word = "", small = "", large="";    
        String[] words = new String[100];    
        int length = 0; 
        
        str = str + " ";    
            
        for(int i = 0; i < str.length(); i++){    
                
            if(str.charAt(i) != ' '){    
                word = word + str.charAt(i);    
            }    
            else{    
                words[length] = word; 
                length++;      
                word = "";    
            }    
        }               
        small = large = words[0];    
              
        for(int k = 0; k < length; k++){    
                
            if(small.length() > words[k].length())    
                small = words[k];    
         
            if(large.length() < words[k].length())    
                large = words[k];    
        }    
        System.out.println("Smallest word: " + small);    
        System.out.println("Largest word: " + large);
        sc.close();
	}

}
