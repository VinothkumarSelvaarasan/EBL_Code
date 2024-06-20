package OOPSConcept;

public class ConstructorPgm {
	String name;
	long mobileNo;
	void printData()
	{
		System.out.println("Name "+name);
		System.out.println("Mobile Number "+mobileNo);
	}
	public static void main(String[] args) {
		ConstructorPgm cp=new ConstructorPgm();
		cp.printData();
		
	}
}
