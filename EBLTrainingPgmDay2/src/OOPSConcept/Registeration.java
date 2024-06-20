package OOPSConcept;

import java.util.Scanner;

public class Registeration {
	int registerationNumber;
	String name;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Register Number");
		registerationNumber=s.nextInt();
		System.out.println("Enter the Name ");
		name=s.next();
	}
	void printData()
	{
		System.out.println("Registeration Number "+registerationNumber);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		Registeration regi=new Registeration();
		regi.getData();
		regi.printData();
	}
	

}
