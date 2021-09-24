package test;

public class Throwsexe {

	public static void main(String[] args) {
		Throwsexe obj =new Throwsexe();

	}
	public void calculator()  
	{
		try {
			div();
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
	public void div() throws ArithmeticException
	{
		System.out.println("Inside div method1");
		
	}

}
