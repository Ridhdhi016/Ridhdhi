//Program to make a File Read Only
import java.io.*;
public class ReadOnlyFile {

	public static void main(String[] args) {
		File file = new File("E:\\Training2021\\seventh_may.txt");
		boolean flag = file.setReadOnly();
		if(flag) {
			System.out.println("File successfully converted to Read only mode!!");
		}
		else {
			System.out.println("Unsuccessful Operation!!");
		}
	}

}
