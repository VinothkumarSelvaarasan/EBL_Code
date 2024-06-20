package DataEnCapsulation;

import java.util.Scanner;

public class PrintStudentInfo {
	Scanner s=new Scanner(System.in);
	Registeration regi=new Registeration();
	void getData()
	{
		System.out.println("Enter your Register Number ");
		regi.setRegisterationNumber(s.nextInt());
		System.out.println("Enter your Name ");
		regi.setStudentName(s.next());
		System.out.println("Enter your Mobile Number");
		regi.setMobileNumber(s.nextLong());
	}
	//Data Encapsulation Concept
	void printInfo()
	{
		System.out.println("Register Number "+regi.getRegisterationNumber());
		System.out.println("Name is "+regi.getStudentName());
		System.out.println("Mobile Number is "+regi.getMobileNumber());
	}
	public static void main(String[] args) {
		PrintStudentInfo pi=new PrintStudentInfo();
		pi.getData();
		pi.printInfo();
	}
	

}
