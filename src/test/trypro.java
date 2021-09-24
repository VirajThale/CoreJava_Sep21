package test;

public class trypro {

	public static void main(String[] args)
	{
		int a=10;
		int b[] = {1,2,3};
		try 
		{
		System.out.println(a/0);
		System.out.println(b[2]);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Inside Arithmatic");
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside the Generic exception");
		}
		finally {
			System.out.println("Inside finally ");
		}
		
		
		
		System.out.println("after exception");
	}
	
}
		


