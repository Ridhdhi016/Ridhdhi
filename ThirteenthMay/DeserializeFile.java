//Program to deserialize above created file back to java object

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Employee implements java.io.Serializable {
  	public String name;
   public String address;
   public int number;
   
   public void displayData() {
      System.out.println("name " + name + "address " + address +"number " +number);
   }
}

public class DeserializeFile {

	public static void main(String[] args) {
		Employee e = null;
	      try {
	         FileInputStream fileIn = new FileInputStream("E:\\Training2021\\employee.txt");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         e = (Employee) in.readObject();
	         in.close();
	         fileIn.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
	      
	      System.out.println("Deserialized of Employee details: ");
	      System.out.println("Name: " + e.name);
	      System.out.println("Address: " + e.address);
	      System.out.println("Number: " + e.number);
	}

}
