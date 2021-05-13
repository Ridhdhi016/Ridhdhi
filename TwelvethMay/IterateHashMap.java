//Program to iterate through the elements of HashMap
import java.util.*;
public class IterateHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter map size:");
		int size=sc.nextInt();
		System.out.println("Enter values: ");
		for(int i=1;i<=size;i++) {
			String n=sc.next();
			map.put(i,n);
		}
		sc.close();
		System.out.println("HashMap elements: " +map);
	}

}
