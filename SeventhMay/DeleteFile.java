//Program to delete file using delete() Method
import java.io.*;
public class DeleteFile {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\Training2021\\seventh_may.txt");
			if(file.delete()) {
				System.out.println(file.getName() + " Successfully deleted..!!");
			}
			else {
				System.out.println("Failed to delete..!!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
