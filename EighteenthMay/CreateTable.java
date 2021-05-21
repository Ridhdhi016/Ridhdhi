//Program to create database table using Java
import java.sql.*;
public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			Statement stmt=con.createStatement(); 
			stmt.executeUpdate("CREATE TABLE registration(id INT NOT NULL, FirstName Varchar(20) NOT NULL, LastName Varchar(20) NOT NULL, Age INT Not Null, PRIMARY KEY ( id ))");
			System.out.println("Table is created.....");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
