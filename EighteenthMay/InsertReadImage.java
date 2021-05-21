

import java.io.*;
import java.sql.*;

public class InsertReadImage {
	public void insertImg()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO images VALUES(?, ?)");
		    pstmt.setString(1, "sample");
		    InputStream in = new FileInputStream("E:\\Training2021\\EighteenthMay\\image.jpg");
		    pstmt.setBlob(2, in);
		    pstmt.execute();
		    System.out.print("Image Inserted.");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readImg()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");
			PreparedStatement ps=con.prepareStatement("select * from images WHERE image IS NOT NULL");  
			ResultSet rs=ps.executeQuery();  
			int i = 1;
			if(rs.next())
			{             
				i++;
				System.out.print("\nName: " + rs.getString(1));
				Blob b=rs.getBlob(2);  
				byte barr[]=b.getBytes(1,(int)b.length());    
				FileOutputStream fout=new FileOutputStream("E:\\Training2021\\EighteenthMay\\image"+ i + ".jpg");  
				fout.write(barr); 
				
				fout.close();  
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InsertReadImage ci = new InsertReadImage();
		ci.insertImg();
		ci.readImg();
	}

}
