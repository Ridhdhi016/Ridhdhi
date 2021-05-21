//Program to insert date in oracle database
import java.sql.*;
public class InsertDate {

	public void Adddate()
	{
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			PreparedStatement st = con.prepareStatement("Insert into registration (FirstName,Age,Date) values (?,?,?)");
			//java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
		    java.util.Date date = new java.util.Date();
		    long t = date.getTime();
		    java.sql.Date sqlDate = new java.sql.Date(t);
			st.setString(1, "kriti");
			st.setInt(2, 10);
			st.setDate(3, sqlDate);
			st.executeUpdate();
			System.out.println("records inserted into table");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		InsertDate id = new InsertDate();
		id.Adddate();
	}
}
