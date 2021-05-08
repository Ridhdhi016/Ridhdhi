//Program to create a text file
import java.io.*;
public class CreateFile {

	public static void main(String[] args) {
		File file = new File("E:\\Training2021\\seventh_may.txt");
		boolean result;
		
		try {
			result = file.createNewFile();
			if(result) {
				System.out.println("File created successfully...!!\n" + file.getCanonicalPath());
			}
			else {
				System.out.println("File already exist...!!\n" + file.getCanonicalPath());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
