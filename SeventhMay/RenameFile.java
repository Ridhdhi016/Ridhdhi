//Program to rename file.
import java.io.*;
public class RenameFile {

	public static void main(String[] args) {
		try {
			File file1 = new File("E:\\Training2021\\seventh_may.txt");
			File file2 = new File("E:\\Training2021\\new.txt");
			if(file1.renameTo(file2)) {
				System.out.println("Successfully Renamed..!!");
			}
			else {
				System.out.println("Failed to Rename..!!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
