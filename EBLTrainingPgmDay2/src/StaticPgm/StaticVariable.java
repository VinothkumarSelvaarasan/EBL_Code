package StaticPgm;

public class StaticVariable {
	int i;
	static int j;
	void inc()
	{
		i++;
		j++;
	}
	void printData()
	{
		System.out.println("I Value is "+i);
		System.out.println("J Value is "+j);
	}
	public static void main(String[] args) {
		StaticVariable sv=new StaticVariable();
		sv.inc();
		sv.inc();
		sv.printData();
		System.out.println("*********Next Object Creation*******");
		StaticVariable sv1=new StaticVariable();
		sv1.inc();
		sv1.inc();
		sv1.printData();
	}

}
