//Program to read a file using BufferedInputStream
import java.io.*;
public class BufferedInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("E:\\Training2021\\seventh_may.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i = 0;
			while((i=bin.read())!=-1) {
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
