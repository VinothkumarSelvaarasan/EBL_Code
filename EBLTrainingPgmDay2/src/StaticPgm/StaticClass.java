package StaticPgm;

public class StaticClass {
	int j=6;
	static int i=66;
	static void printData()
	{
		//System.out.println("J Value is "+j);
		System.out.println("I Value is "+i);
		
	}
	void printDat1()
	{
				System.out.println("J Value is "+j);
				System.out.println("I Value is "+i);
	}
	public static void main(String[] args) {
		StaticClass st1=new StaticClass();
		st1.printDat1();
		printData();
	}

}
