//Program to execute batch of SQL statements

import java.sql.*;
public class ExecuteBatch {

	public void execute() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			Statement st=con.createStatement();
			st.addBatch("insert into registration(FirstName,Age) values ('Mitesh',25)");
			st.addBatch("insert into registration(FirstName,Age) values ('Parita',29)");
			st.executeBatch();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ExecuteBatch e=new ExecuteBatch();
		e.execute();
		System.out.print("records added into table ");
		
	}

}
