package Array1d;
import java.util.Scanner;
public class SingleDimension {
	public static void main(String[] args) {
		int registerationNo;
		String name;
		int []marks=new int[6];	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Registeration Number");
		registerationNo=s.nextInt();
		System.out.println("Enter the Name ");
		name=s.next();
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the Marks for Subject "+(i+1));
			marks[i]=s.nextInt();
		}
		System.out.println("Registeration Number is "+registerationNo);
		System.out.println("Name is "+name);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks for Subject "+(i+1)+" is "+marks[i]);
			//marks[i]
		}	
	}
}
