package StaticPgm;
public class StaticKeyWord {
	static {
		System.out.println("Static Block 1");
	}
	StaticKeyWord()
	{
		System.out.println("I am a Constructor");
	}
	static 
	{
		System.out.println("Static Blockl 2");
	}
	public static void main(String[] args) {
		StaticKeyWord sk1=new StaticKeyWord();
		
	}

}
