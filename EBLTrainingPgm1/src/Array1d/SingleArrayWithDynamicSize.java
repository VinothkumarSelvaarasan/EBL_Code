package Array1d;

import java.util.Scanner;

public class SingleArrayWithDynamicSize {
	public static void main(String[] args) {
		int registerNumber;
		String name;
		int marks[];
		int size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Register Number ");
		registerNumber=s.nextInt();
		System.out.println("Enter the Name ");
		name=s.next();
		System.out.println("Enter the Size u want to Create in Array");
		size=s.nextInt();
		marks=new int[size];
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the marks for the Subject "+(i+1));
			marks[i]=s.nextInt();
		}
		System.out.println("Register Number is "+registerNumber);
		System.out.println("Name is "+name);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("The marks for the Subject "+(i+1)+ " is "+marks[i]);
		}
	}

	
	

}
