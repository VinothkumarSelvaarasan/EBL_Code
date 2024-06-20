package Abstract;

abstract class Register
{
	Register()
	{
		System.out.println("I am a Abstract Class Constructor");
	}
	abstract void getData();
	void printData()
	{
		System.out.println("I am a non Abstract Method");
	}
}

public class AbstractPgm extends Register {

	
	void getData() {
		System.out.println("I am Abstract Method now present in Child Class");
		
	}
	public static void main(String[] args) {
		Register r=new AbstractPgm();
		r.getData();
		r.printData();
	}

}
