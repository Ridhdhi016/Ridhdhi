//Program to read a file using BufferedReader
import java.io.*;
public class BufferedReaderExample {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\Training2021\\seventh_may.txt");
			BufferedReader br = new BufferedReader(fr);
			int i;
			while((i=br.read())!=-1) {
				System.out.print((char)i);
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
