//Program to commit & rollback

import java.sql.*;
import java.sql.DriverManager;
public class CommitRollback {

	public static void main(String[] args) throws Exception {
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			con.setAutoCommit(false);
		     Statement stmt=con.createStatement();
		     String query1="INSERT INTO registration(FirstName,Age) VALUES('raj',20)";
		     stmt.executeUpdate(query1);
		     String query2="INSERT INTO employee(Name,city) VALUES('krisha','morbi')";
		     stmt.executeUpdate(query2);
		     con.commit();
		     System.out.println("records inserted into table");
		     con.rollback();
		     con.close();  
		 } 
		 catch (SQLException e) 
		 {
		     e.printStackTrace();
		 }
	}

}
