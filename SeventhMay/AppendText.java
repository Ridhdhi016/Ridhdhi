//Program to append text to a file using BufferedWriter, PrintWriter, FileWriter
import java.io.*;
public class AppendText {

	public static void main(String[] args) {
		try {
			File file = new File("E:\\Training2021\\seventh_may.txt");
			
			if(file.exists()==false) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println();
			pw.println("First Line appended.");
			pw.println("Second Line appended");
			pw.close();
			bw.close();
			fw.close();
			System.out.println("Data Successfully Appended..!!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
