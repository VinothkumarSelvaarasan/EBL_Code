package OOPSConcept;

public class ConstructorWithoutArg {
	String Name;
	String dept;
	ConstructorWithoutArg()
	{
		Name="Vinothkumar Selvaarasan";
		dept="Computer Science";
	}
	void printData()
	{
		System.out.println("Name is "+Name);
		System.out.println("Department is "+dept);
	}
public static void main(String[] args) {
	ConstructorWithoutArg cwa=new ConstructorWithoutArg();
	cwa.printData();
}
}
