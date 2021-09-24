package test;

public class throwexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age =20;
		
		throwexception obj = new throwexception();		
		try{
			obj.agecheck(age);
			}catch(ArithmeticException e) {
				System.out.println("Exception");
			}
		System.out.println("after exception");
		}
	
		
		
		public void agecheck(int age) 
		{
			if (age<18) {
				throw new ArithmeticException("age is not allowed"); 
			}
		else {
			System.out.println("Eligible");
		}

	}
}
