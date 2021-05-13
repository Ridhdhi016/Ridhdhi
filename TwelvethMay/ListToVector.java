//Program to convert List into Vector

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class ListToVector {

	public static void main(String[] args) {
		ArrayList <Integer> a1=new ArrayList <Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		System.out.println("Enter numbers: ");
		for(int i=1;i<=size;i++) {
			int n=sc.nextInt();
			a1.add(n);
		}
		sc.close();
		System.out.println("List: " +a1);
        Vector<Integer> v1 = new Vector<Integer>(a1);
		System.out.println("converted list into vector: " +v1);
	}
}
