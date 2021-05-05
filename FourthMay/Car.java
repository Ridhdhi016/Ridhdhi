/*"Program to store the information of the car (Name, Model, Year of Purchase, Purchase price). Price of the car is depreciated 10% every year. And minimum resale price should 20% of the purchase price. Write a method to calculate the resale price of the car in the provided year.
For eg, 
Car purchased in 2017 by 1000000 rs
Resale price in 2018 will be 900000 rs
Resale price in 2019 will be 8,10,000 rs"
*/
import java.util.*;
public class Car {

	public static void depreciation(double price, int year, int resaleyear)
	{
		int depercent=10;
		double temp=price;
		for(int i=1; i<=resaleyear; i++)
		{
			price=((100-depercent)*price)/100;
			year=year+1;
			if(price>=temp*0.2)
			{
				System.out.println("Resale price in " + year + "will be " + price);
			}
			else
			{
				break;
			}
		}	
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter car name: "); 
		String name = sc.next();
		
		System.out.println("Enter model: ");
		String model = sc.next();
		
		System.out.println("Enter year: ");
		int purchaseyear = sc.nextInt();
		
		System.out.println("Enter price: ");
		double purchaseprice = sc.nextDouble();
		
		System.out.println("Enter year after puchase for which you want to get depreciation price:");
		int afteryear = sc.nextInt();
		
		depreciation(purchaseprice, purchaseyear, afteryear);
	}

}
