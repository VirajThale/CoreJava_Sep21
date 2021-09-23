package test;

public class Array3{
public static void main (String[] args) {

	int i;
	int[] array1 = {10,20,30,40,50,60};
	
	for (i=1;i<=10;i++) {
		System.out.println(i);
	}
	
	for(i=0;i<array1.length;i++) {
		System.out.println(array1[i]);
	}
	for(i=array1.length-1; i>=0;i--) {
		System.out.println(array1[i]);
	}
	
	for(int values:array1) {
		System.out.println(values);
	}


}
}