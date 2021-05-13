//Write generic method to print arrays of different types
public class PrintArrays {
	public static <E> void printArray(E[] inputArray) {
	    for (E element : inputArray)
	      System.out.printf("%s ", element);

	    System.out.println();
	  }

	  public static void main(String args[]) {
	    Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
	    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
	    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	    System.out.println("integer Array:");
	    printArray(intArray); 
	    System.out.println("\ndouble Array:");
	    printArray(doubleArray); 
	    System.out.println("\ncharacter Array:");
	    printArray(charArray); 
	  } 
}
