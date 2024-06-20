package ExceptionHandler;
import java.util.Scanner;

public class Pgm1 {
	int i,j,k;
	Scanner s=new Scanner(System.in);
	int registerationNo[]= {92,91,90,78,99};
	void getData()
	{
		System.out.println("Enter the I value");
		i=s.nextInt();
		System.out.println("Enter the J value");
		j=s.nextInt();
		try {
			k=i/j;
			System.out.println("K Value is "+k);
			for(int i=0;i<=registerationNo.length;i++)
			{
				System.out.println(registerationNo[i]);
			}
		}
		
		catch(ArithmeticException ae)
		
		{
			System.out.println(ae);
		}
		catch (Exception e) {
			System.out.println(e);
			}
		finally
		{
			System.out.println("Hi i am a finally block");
		}
		
		
	
		
		System.out.println("Welcome to Exception Handler Session");
		
		
	}
	
	public static void main(String[] args) {
		Pgm1 p1=new Pgm1();
		p1.getData();
	}

}
