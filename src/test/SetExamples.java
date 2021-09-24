package test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExamples {

	public static void main(String[] args) {

		HashSet<String> hash =new HashSet<String>();
		
		hash.add("Name1");
		hash.add("Name2");
		hash.add("Name3");
		hash.add(null);
		hash.add("Name4");
		hash.add(null);
//		hash.add("Name1");
		
		System.out.println(hash);
		
		
		LinkedHashSet<String> hashl =new LinkedHashSet<String>();
		hashl.add("name5");
		hashl.add("name2");
		hashl.add("name3");
		hashl.add("name1");
		hashl.add("name1");// no duplicate value allow 
		System.out.println(hashl);
		
		
		
	
	}

}
