/*Rama started on a quest of visiting temples, with few coins in his pockets. As soon as he visits any temple, the money in his pocket gets doubled and on his way out, he donates certain money to each temple. He visits some temples on his quest. After visiting the last temple, his pocket is empty of all the money, so how much money he had initially.
Write a program which takes number of temples and donation amount as parameters and calculate initial money.*/
import java.util.Scanner;
public class InitialMoney {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Total number of temples: ");
		int total_temple = sc.nextInt();
		
		System.out.print("Enter Donation Amount:: ");
		int donation_amount = sc.nextInt();
		
		findInitialMoney(total_temple, donation_amount);
		
		sc.close();
	}

	public static void findInitialMoney(int temple, int donation)
	{
		int total=1;
		float initial,amount=0.0f;
		for(int i=1; i<=temple; i++)
		{
			total = 2*total;
		}
		amount=donation*total-donation;
		initial=amount/total;
		System.out.println("Initial Money : "+ initial);
	}
}
