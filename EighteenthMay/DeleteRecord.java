//Program to delete record from database
import java.sql.*;
public class DeleteRecord {
  
    public static void main(String[] args)
    {
    	try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
	        PreparedStatement p=null;
	        String sql="DELETE FROM student where EnrollmentNo=2";
	        p =con.prepareStatement(sql);
	        p.execute();
	        System.out.println("Successfully deleted...");
        }
    	catch(Exception  e){
            System.out.println(e);   
        }
    }      
}