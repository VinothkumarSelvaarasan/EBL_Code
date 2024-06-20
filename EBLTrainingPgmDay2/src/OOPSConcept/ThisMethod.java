package OOPSConcept;

public class ThisMethod {
	long aadharNumber;
	String aadharName;
	ThisMethod()
	{
		aadharNumber=83737378;
		aadharName="Vinothkumar Selvaarasan";
		this.printData();
	
	}
	void printData()
	{
		System.out.println("Aadhar Number is "+aadharNumber);
		System.out.println("Aadhar Name  is "+aadharNumber);
	}
	public static void main(String[] args) {
		ThisMethod tm=new ThisMethod();
	}
	

}
