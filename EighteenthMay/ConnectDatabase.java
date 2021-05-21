//Program to connect database
import java.sql.*;  
public class ConnectDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root"); 
			System.out.println("Connected..");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
