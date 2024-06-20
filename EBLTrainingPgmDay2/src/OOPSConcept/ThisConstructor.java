package OOPSConcept;

public class ThisConstructor {
	int RegisterationNumber;
	String name;
	ThisConstructor()
	{
		RegisterationNumber=123456789;
		name="Vinothkumar";
	}
	ThisConstructor(int RegisterationNumber,String name)
	{
		this();
		this.printData();
		this.RegisterationNumber=RegisterationNumber;
		this.name=name;
		this.printData();
	
	}
	void printData()
	{
		System.out.println("Registeration Number "+RegisterationNumber);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		ThisConstructor tc=new ThisConstructor(73737,"Ashok");
		
	}

}
