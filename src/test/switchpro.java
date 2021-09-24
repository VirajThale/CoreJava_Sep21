package test;

public class switchpro 
{
public static void main (String[] args) {
	int age= 18;
	switch(age) {
	case 18:
	case 19:
		System.out.println("Eligible");
		break;
	case 17:
		System.out.println("will be eligible next year ");
		break;
	case 15:
		System.out.println("Ineligible");
		break;
	default:
		System.out.println("Default block");
	}
}
	
}