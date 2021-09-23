package test;

public class StringExample {
public static void main (String[] args) {
	String fname ="Viraj";
	String lname ="Thale";
	String fullname = fname + " " +lname;
	System.out.println("your name:"+fullname);
	System.out.println("Your length "+ fullname.length());
	String newname = fullname.replace("" ,",");
	System.out.println("new name"+newname);
	}
}