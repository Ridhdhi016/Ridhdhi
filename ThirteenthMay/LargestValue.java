//Write generic method to return largest value of three comparable objects

import java.util.Scanner;
public class LargestValue {
	public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
		T max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int n1,n2,n3;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		System.out.println("Maximum is "+maximum(n1,n2,n3));
		sc.close();
	}

}
