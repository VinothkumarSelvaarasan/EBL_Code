package ConditionalStatment;
import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		int age;
		String gender;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age ");
		age=s.nextInt();
		if(age<60)
		{
			System.out.println("Upper Birth Alloted");
		}
		else
		{
			System.out.println("Enter your Gender ");
			gender=s.next();
			if(gender.equals("m") || gender.equals("M"))
			{
				System.out.println("Middle Birth Alloted");
			}
			else
			{
				System.out.println("Lower Birth Alloted");
			}
		}	
	}
}