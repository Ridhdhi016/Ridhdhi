//Program to Copy elements of a Vector to another Vector

import java.util.*;
public class CopyVector {

	public static void main(String[] args) {
		Vector <String> v1=new Vector <String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vector size:");
		int size=sc.nextInt();
		System.out.println("Enter numbers: ");
		for(int i=1;i<=size;i++) {
			String n=sc.next();
			v1.add(n);
		}
		sc.close();
		Object copy=v1.clone();
		System.out.println("Main vector: "+v1);
		System.out.println("Copy vector: "+copy);
		
	}

}
