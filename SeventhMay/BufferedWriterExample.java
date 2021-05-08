//Program to write to file using BufferedWriter
import java.io.*;
import java.util.Scanner;
public class BufferedWriterExample {

	public static void main(String[] args) {
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter something which you want to write in file..");
			String s = sc.nextLine();
			
			FileWriter fw = new FileWriter("E:\\Training2021\\seventh_may.txt");
			fw.write(s);
			fw.close();
			sc.close();
			System.out.println("Successfully Written..!!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
