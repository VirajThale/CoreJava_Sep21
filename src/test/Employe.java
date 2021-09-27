package test;

public class Employe extends Person
{
		protected int EmpID;
		public int Salary;
		static String Department="Technology";
		
		public Employe() {
			super();
			System.out.println("Inside emp cons");
			
		}
		
		public Employe(int empID, int salary) {
			
			this();
			
			this.EmpID =empID;
			this.Salary = salary;
			
		}
		public Employe(String name,String city,int age ,int empID, int salary) {
			
			
			super(name,city,age);
			
			this.EmpID =empID;
			this.Salary = salary;
			
			
		}
		
		public void display() 
		
		{
			System.out.println("Emp ID is :"+EmpID);
			System.out.println("Emplye Salary :"+Salary);
			System.out.println("Dept is: "+Employe.Department);
			System.out.println("Your Name:"+super.Name);
			System.out.println("Your city :"+super.City);
			System.out.println("Your age: "+super.Age);
			
		}
	

}
