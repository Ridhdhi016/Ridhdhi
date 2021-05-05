/*Program to find number is suny number*/
import java.util.Scanner;
public class SunyNumber {

   public static boolean isSuny(int number) {
      if(Math.sqrt(number+1)%1 == 0)
         return true;
      else 
    	  return false;
   }

   public static void main(String[] args) {

      int number = 0;
      boolean result = false;

      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter an integer number: ");
      number = sc.nextInt();

      result = isSuny(number);

      if(result)
          System.out.println(number + " is a Suny number");
      else
          System.out.println(number + " is not a Suny number");

      sc.close();
   }
}
