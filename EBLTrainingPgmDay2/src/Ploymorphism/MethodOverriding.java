package Ploymorphism;


import java.util.Scanner;

class OwnerDeatils
{
	String ownerName;
	String carModel;
	String fuelType;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Owner Name");
		ownerName =s.next();
		System.out.println("Enter the Car Model ");
		carModel=s.next();
		System.out.println("Enter the Fuel Type");
		fuelType=s.next();
	}
	void printData()
	{
		System.out.println("Owner Name "+ownerName);
		System.out.println("Car Model "+carModel);
		System.out.println("Fuel Type "+fuelType);
	}
}
class dealerClass extends OwnerDeatils
{
	String dealerName;
	long phoneNo;
	String manuName;
	void getData()
	{
		System.out.println("Enter the Dealer Name ");
		dealerName=s.next();
		System.out.println("Enter the Phone Number ");
		phoneNo=s.nextLong();
		System.out.println("Enter the Manufacturer Name");
		manuName=s.next();
	}
	void printData()
	{
		System.out.println("Dealer Name "+dealerName);
		System.out.println("Phone Number "+phoneNo);
		System.out.println("Manufacturer Name "+manuName);
	}
	
	
}

public class MethodOverriding {
	public static void main(String[] args) {
		OwnerDeatils od=new OwnerDeatils();
		dealerClass dc=new dealerClass();
		od.getData();
		dc.getData();
		od.printData();
		dc.printData();
	}
	

}
