package OOPSConcept;

public class ThisKeywordVariable {
	String Name;
	int Registeration;
	ThisKeywordVariable(String Name,int Registeration)
	{
		this.Name=Name;
		this.Registeration=Registeration;
	}
	void printData()
	{
		System.out.println("Name is "+Name);
		System.out.println("Registeration is "+Registeration);
	}
	public static void main(String[] args) {
		ThisKeywordVariable tkv=new ThisKeywordVariable("Vinothkumar", 666);
		tkv.printData();
	}

}
