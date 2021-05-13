//Write a generic method to find the maximal element in the range [begin, end) of a list.

import java.util.*;
public class MaximalElement {	
public static <T extends Comparable<T>> T maximalelement (List<T> list, int from, int to) {
    T max = list.get(from);
    for (int i = from + 1; i < to; i++) {
        T elem1 = list.get(i);
        if (elem1.compareTo(max) > 0) {
            max = elem1;
        }
    }
    return max;
}
public static void main(String[] args) {
	ArrayList <Integer> al = new ArrayList <Integer> ();
	al.add(1);
	al.add(44);
	al.add(30);
	al.add(14);
	al.add(5);
	System.out.print("Maximal Element :"+maximalelement(al,0,3));
}
}