/*Program to find sum of n natural numbers with and without using loops*/
import java.util.Scanner;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int i,num,sum=0,sum1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		num=sc.nextInt();
		for(i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		sum1=(num*(num+1))/2;
		System.out.println("Sum of First " +num+ " Number using loop is:" +sum);	
		System.out.println("Sum of First " +num+ " Number without using loop is:" +sum1);
		sc.close();
	}
}