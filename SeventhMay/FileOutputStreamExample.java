//Program to write to a file using FileOutputStream
import java.io.*;
import java.util.Scanner;
public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter something which you want to write in file..");
			String s = sc.nextLine();
			
			FileOutputStream fout = new FileOutputStream("E:\\Training2021\\seventh_may.txt");
			byte[] arr = s.getBytes();
			fout.write(arr);
			fout.close();
			sc.close();
			System.out.println("Successfully Written..");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
