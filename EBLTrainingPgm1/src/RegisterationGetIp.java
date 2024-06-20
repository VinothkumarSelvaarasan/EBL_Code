import java.util.Scanner;

public class RegisterationGetIp {
public static void main(String[] args) {
	int registerationNumber;
	String Name;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Registeration Number ");
	registerationNumber=s.nextInt();
	System.out.println("Enter the Name ");
	Name=s.next();
	System.out.println("Registerstion Number is "+registerationNumber);
	System.out.println("Name is "+Name);
}
}
