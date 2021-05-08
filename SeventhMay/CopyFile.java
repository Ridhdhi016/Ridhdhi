//Program to Copy a File to another File
import java.io.*;
public class CopyFile {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("E:\\Training2021\\src.txt");
			FileWriter fw = new FileWriter("E:\\Training2021\\dest.txt");
			int i;
			while((i=fr.read())!=-1) {
				fw.write(i);
			}
			fw.close();
			fr.close();
			System.out.println("Successfully Copied..!!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
