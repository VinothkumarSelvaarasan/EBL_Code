package SuperKeyWordPgm;

import java.util.Scanner;

class OwnerDeatils
{
	String ownerName;
	String carModel;
	String fuelType;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("****** Super Keyword************");
		System.out.println("Enter the Owner Name");
		ownerName =s.next();
		System.out.println("Enter the Car Model ");
		carModel=s.next();
		System.out.println("Enter the Fuel Type");
		fuelType=s.next();
	}
	void printOwnerData()
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
	void getDealerDetails()
	{
		super.getData();
		System.out.println("Enter the Dealer Name ");
		dealerName=s.next();
		System.out.println("Enter the Phone Number ");
		phoneNo=s.nextLong();
		System.out.println("Enter the Manufacturer Name");
		manuName=s.next();
	}
	void printData()
	{
		super.printOwnerData();
		System.out.println("Dealer Name "+dealerName);
		System.out.println("Phone Number "+phoneNo);
		System.out.println("Manufacturer Name "+manuName);
	}
}
public class SuperKeyWord {
	public static void main(String[] args) {
		dealerClass dc=new dealerClass();
		dc.getDealerDetails();
		dc.printData();
	}
	

}
