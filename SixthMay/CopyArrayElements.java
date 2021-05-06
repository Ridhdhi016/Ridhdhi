/*Program to copy all elements of one array into another array*/
public class CopyArrayElements {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int[arr1.length];
		int i;
		
		for(i=0; i<arr1.length; i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("Original Array:");
		for(i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		System.out.println("Copied Array:");
		for(i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
}
