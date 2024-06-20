package InterfacePgm;

interface informationCollector
{
	void getdata();
	void printData();
}
interface printAcademic
{
	void printAcademicRecord();
	
}

public class InterfacePgm implements informationCollector ,printAcademic{
	
	@Override
	public void getdata()
	{
		System.out.println("Hi i am a getData Method");
	}
	@Override
	public	void printData()
	{
		System.out.println("I am a PrintData Method");
	}
	@Override
	public void printAcademicRecord()
	{
		System.out.println("I am from Second Interface");
	}

	public static void main(String[] args) {
		InterfacePgm ip=new InterfacePgm();
		ip.getdata();
		ip.printData();
		ip.printAcademicRecord();
	}
}
