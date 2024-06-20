package SuperKeyWordPgm;
class StudentDetails
{
	String name;
	int registerNumber;
	String dept;
	StudentDetails()
	{
		name="Selva";
		registerNumber=777;
		dept="Printing Technology";
	}
	StudentDetails(String name,int registerNumber,String dept)
	{
		this.name=name;
		this.registerNumber=registerNumber;
		this.dept=dept;
	}
	void printData()
	{
		System.out.println("Name is "+name);
		System.out.println("Register Number is "+registerNumber);
		System.out.println("Department "+dept);
	}
}

class AcademicDetails extends StudentDetails
{
	float tenthPercentage;
	float twelthPercentage;
	AcademicDetails()
	{	super();
		tenthPercentage=92.0f;
		twelthPercentage=99.2f;
		super.printData();
		this.printAcademic();
	}
	AcademicDetails(String n,int r,String d,float tenthPercentage,float twelthPercentage){
		super(n,r,d);
		this.tenthPercentage=tenthPercentage;
		this.twelthPercentage=twelthPercentage;
		super.printData();
		this.printAcademic();
	}
	void printAcademic(){
		System.out.println("Tenth Percentage "+tenthPercentage);
		System.out.println("Twelth Percentage "+twelthPercentage);
	}
}
public class SuperKeywordCons {
	public static void main(String[] args) {
		AcademicDetails ad=new AcademicDetails();
		AcademicDetails ad1=new AcademicDetails("Vino",666,"CSE",98.5f,99.5f);
	}

}
