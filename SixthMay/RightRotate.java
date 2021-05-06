//Program to right rotate the elements of an array
import java.util.*;
public class RightRotate {
    void rotate(int a[], int n, int r) {
        int i;
        System.out.println("Original Array:  ");
        
        for(i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }

        //j loop to right rotate k times
        for (int j=1;j<=r;j++)
        {
            //store last element in a temporary variable
            int x = a[n-1];
            for(i=n-1;i>0;i--)
            {
                //shift all elements
                a[i] = a[i-1];
            }
            //assign new value to first index
            //shifting of last element to the first position
            a[0] = x;

        }

        System.out.println(" ");
        System.out.println("Right Rotated Array: ");

        for(i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = ob.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the number of times the array needs to be rotated right");
        int r = ob.nextInt();
        System.out.println("Enter elements in array");
        for(int j=0;j<n;j++)
        {
            A[j] = ob.nextInt();
        }

        RightRotate rra = new RightRotate();

        rra.rotate(A, n, r);
        ob.close();
    }
}