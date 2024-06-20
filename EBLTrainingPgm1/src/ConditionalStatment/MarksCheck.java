
package ConditionalStatment;

import java.util.Scanner;

public class MarksCheck {
	public static void main(String[] args) {
		int marks;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Marks");
		marks=s.nextInt();
		if(marks>=45)
		{
			System.out.println("Pass");
		}
		else {
		System.out.println("Fail");
		}
	}

}

