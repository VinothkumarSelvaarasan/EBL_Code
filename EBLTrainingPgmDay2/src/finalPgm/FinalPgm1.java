package finalPgm;

public class FinalPgm1 {
	final String company;
	FinalPgm1()
	{
		company="LNT";
	}
	
	 void printData()
	{
		System.out.println("Comapny Name is "+company);
	
	}
	public static void main(String[] args) {
		
		FinalPgm1 fp=new FinalPgm1();
		fp.printData();
	}

}
