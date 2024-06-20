package Ploymorphism;

public class MethodOverloadingPgm {
	void printInfo()
	{
		System.out.println("Welcome to Method Loading");
	}
	void printInfo(String name)
	{
		System.out.println("Welcome "+name);
	}
	void printInfo(String name,int RegisterNo)
	{
		System.out.println(" Hi Welcome "+name+ " and register no is "+RegisterNo);
	}
	void printInfo(int RegisterNo,String name)
	{
		System.out.println("Welcome "+name+ " and register no is "+RegisterNo);
	}
	public static void main(String[] args) {
		MethodOverloadingPgm molp=new MethodOverloadingPgm();
		molp.printInfo();
		molp.printInfo("Vinothkumar Selvaarasan");
		molp.printInfo("Vinothkumar Selvaarasan", 666);
	}

}
