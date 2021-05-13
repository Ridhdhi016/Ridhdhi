//Write a Employee class which contains basic information of a employee and serialize it into text file.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable {
	  	public String name;
	   public String address;
	   public int number;
	   
	   public void displayData() {
	      System.out.println("name " + name + "address " + address +"number " +number);
	   }
}

public class SerializeFile {

	public static void main(String[] args) {
		Employee e1 = new Employee();
	      e1.name = "Nensy Mehta";
	      e1.address = "Rajkot";
	      e1.number = 101;
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("E:\\Training2021\\employee.txt");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e1);
	         out.close();
	         fileOut.close();
	         System.out.println("Serialized data is saved in D:\\Training2021\\employee.txt");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}

}
