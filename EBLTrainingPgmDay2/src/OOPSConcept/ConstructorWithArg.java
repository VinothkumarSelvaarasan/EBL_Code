package OOPSConcept;

public class ConstructorWithArg {
	String name;
	String gender;
	ConstructorWithArg()
	{
		name="Vinothkumar Selvaarasan";
		gender="Male";
	}
	ConstructorWithArg(String n,String g)
	{
		name=n;
		gender=g;
	}
	void printData()
	{
		System.out.println("Name is "+name);
		System.out.println("Gender is "+gender);
	}
	public static void main(String[] args) {
		ConstructorWithArg cwa=new ConstructorWithArg();
		cwa.printData();
		ConstructorWithArg cwa123=new ConstructorWithArg("Lakshmi", "Female");
		cwa123.printData();
	}

}
