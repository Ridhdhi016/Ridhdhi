//Program to insert, update, delete & select records
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;
public class InsertUpdateDelete {
	public void insert() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			Statement stmt=con.createStatement(); 
			int i=stmt.executeUpdate("INSERT INTO registration(FirstName, Age) VALUES ('Radha',19),('Kevin',25)");
			if(i>0) {
			System.out.println("inserted records into table ");
						}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void update(int id2,String FirstName2,int Age2) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			String update="UPDATE registration " + "SET FirstName2=?"+" Age2=?"+" WHERE id2=?";
			PreparedStatement pt=con.prepareStatement(update); 
			pt.setInt(1,id2);
			pt.setString(2, FirstName2);
			pt.setInt(3, Age2);
			
			
			int i = pt.executeUpdate(update); 
 			if(i>0) { 
 				System.out.println("Updated records into table "); 
 			} 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void delete(int id1) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			String delete="DELETE FROM registration WHERE id=?";
			PreparedStatement pt=con.prepareStatement(delete); 
			pt.setInt(1,id1);
			int i = pt.executeUpdate(); 
 			if(i>0) { 
 				System.out.println("Deleted records into table "); 
 			} 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void select() {
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
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-Insert  2-Update  3-Delete  4-View Records");
			System.out.println("Enter choice");
			int ch=sc.nextInt();
			InsertUpdateDelete i=new InsertUpdateDelete();
			switch(ch) {
			case 1:
				i.insert();
				break;
				
			case 2:
				i.select();
				System.out.print("Enter id of the record which you want to update: ");
				int id = sc.nextInt();
				System.out.print("Enter New Name: ");
				String FirstName = sc.next();
				System.out.print("Enter New Age: ");
				int Age = sc.nextInt();
				i.update(id, FirstName, Age);
				break;
				
			case 3:
				i.select();
				System.out.print("Enter id of the record which you want to delete: ");
				int id1 = sc.nextInt();
				i.delete(id1);
				break;
				
			case 4:
				i.select();
				break;
				
			default:
				System.out.print("Invalid Choice");
				break;
			}
			//sc.close();
			
		}

	}

}
