//Program to find Min and Max from the List

import java.util.*;

public class MinMax {

	public static void main(String[] args) {
		List <Integer> a1=new ArrayList <Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter list size:");
		int size=sc.nextInt();
		System.out.println("Enter numbers: ");
		for(int i=1;i<=size;i++) {
			int n=sc.nextInt();
			a1.add(n);
		}
		sc.close();
		System.out.println("max: " + Collections.max(a1));
	    System.out.println("min: " + Collections.min(a1));
	}

}
