package test;

public class revnum {
public static void main (String[] args) {

	int n1=456251;
	int count=0;
	while(n1>0) 
	{
	int r= n1%10;
	System.out.print(r);
	count++;
	n1=n1/10;}
	
	System.out.println("count is "+count);
}
}