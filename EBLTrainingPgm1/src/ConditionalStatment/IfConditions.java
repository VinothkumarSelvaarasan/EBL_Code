package ConditionalStatment;

import java.util.Scanner;

public class IfConditions {
	public static void main(String[] args) {
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Marks");
		marks=s.nextInt();
		if(marks>=45)
		{
			System.out.println("Pass");
		}
		System.out.println("Fail");
	}

}
