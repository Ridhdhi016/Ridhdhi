//Program to swap 2 numbers using vectors
import java.util.Collections;
import java.util.Vector;
public class SwapNumbers {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("Before swapping");
		v.add("1");
		v.add("2");
		System.out.println(v);
		Collections.swap(v, 0, 1);
		System.out.println("After swapping");
		System.out.println(v);
	}

}
