//Program to Find 3rd Largest Number in an array
import java.util.Scanner;
public class ThirdLargestNumber {
	public static void GetThirdLargest(int[] arr,int n) {
		int temp;  
		for (int i = 0; i < n; i++)   
		        {  
		            for (int j = i + 1; j < n; j++)   
		            {  
		                if (arr[i] > arr[j])   
		                {  
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		       
		System.out.println("3rd Largest Number is " +arr[n-3]);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements you want in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		if(n>=3)
		{
			System.out.println("Enter all elements:");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			GetThirdLargest(arr,n);
			sc.close();
		}
		else
		{
			System.out.println("Please enter atleast three elements.");
		}
	}
}
