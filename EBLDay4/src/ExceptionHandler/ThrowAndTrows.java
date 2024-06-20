package ExceptionHandler;

public class ThrowAndTrows {
	void getInput(String text) throws NullPointerException
	{
		if(text.equalsIgnoreCase("null"))
		{
			throw new NullPointerException("Given Text is Empty");
		}
	}
	public static void main(String[] args) {
		ThrowAndTrows tt=new ThrowAndTrows();
		try
		{
			tt.getInput("Ajay");
			tt.getInput(null);
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne.getMessage());
		}
		
	}

}
