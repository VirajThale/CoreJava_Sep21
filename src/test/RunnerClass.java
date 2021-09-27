package Test;

public class RunnerClass {
	
	public static void main (String args[]) {
		
		Employe emp1 = new Employe();
		
		emp1.EmpID =55554;
		emp1.Salary =50000;
		emp1.display();
		
		Employe emp2 = new Employe(3122,40000); //param constructor 
		
		Employe emp3 = new Employe("Rajesh", "Mumbai",25, 00011,50005); // Overriding construe
		
		Polymorphiexample obj = new Polymorphiexample();
		
		emp2.display();
		emp3.display();
		obj.add(12,18);
		obj.add(8,5,9);
		obj.add(12.5,45.6);
		Account obja =new Account();    
		obja.setAccountName("Raju");
		System.out.println(obja.getAccountName());
		
}
}
