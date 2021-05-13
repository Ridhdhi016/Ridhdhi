//Program to compare two array list

import java.util.ArrayList;
import java.util.Scanner;

public class CompareArrayLIst {

	public static void main(String[] args) {
		ArrayList <Integer> a1=new ArrayList <Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size1:");
		int size=sc.nextInt();
		System.out.println("Enter first array numbers: ");
		for(int i=1;i<=size;i++) {
			int n=sc.nextInt();
			a1.add(n);
		}
		
		ArrayList <Integer> a2=new ArrayList <Integer>();
		System.out.println("Enter array size2:");
		int size2=sc.nextInt();
		System.out.println("Enter second array numbers: ");
		for(int i=1;i<=size2;i++) {
			int n1=sc.nextInt();
			a2.add(n1);
		}
		sc.close();
		if(a1.equals(a2)) {
			System.out.println("array list are equal");
		}
		else {
			System.out.println("array list are not equal");
		}
	}

}
