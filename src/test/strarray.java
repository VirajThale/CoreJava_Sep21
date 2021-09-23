package test;

public class strarray {
public static void main (String[] args) {
	
	String str1="Welcome to";
	String revstr1="";
	String arrstr="Clean india green india";
	
	for (int j =0;j<str1.length();j++)
	
	System.out.println(str1.charAt(j));
	
	for(int k=str1.length()-1;k>=0;k--) 
		revstr1 += str1.charAt(k);
	System.out.println("reverse str:"+revstr1);
	
	
	String [] words =arrstr.split("");
	System.out.println(words.length);
	

	String [] words1 =arrstr.trim().split(" ");
	System.out.println(words1.length);
	
}


}