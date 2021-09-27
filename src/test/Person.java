package test;

public class Person {
	public String Name;
	public int Age ;
	public String City;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String name,String city,int age) {
		this.Name=name;
		this.Age=age;
		this.City=city;
	}
	public void display() {
		
		System.out.println("Your name :"+Name);
		System.out.println("Your City :"+City);
		System.out.println("Your age :"+Age);
		
	}


	

}
