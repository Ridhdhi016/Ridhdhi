//Program to execute SQL select query
import java.sql.*;
public class SelectQuery {

	public void selectrecords()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			String select="SELECT * FROM registration ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id")+" FirstName: "+rs.getString("FirstName")+"  Age: "+rs.getInt("Age"));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		SelectQuery sq = new SelectQuery();
		sq.selectrecords();

	}

}
