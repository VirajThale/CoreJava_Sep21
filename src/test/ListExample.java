package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("Viraj");
		list.add("Thale");
		list.add("Dattatray");
		list.add(null); //array allow us to store null value
		
		System.out.println(list);
		//System.out.println(list.get(2));
//		System.out.println(list.set(1,"Viraj"));
//		System.out.println(list);
//		System.out.println(list.remove("Viraj"));
//		System.out.println(list.set(1,"Thale"));
//		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		Iterator <String> itr = list.iterator();
		while(itr .hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String data:list) {
			            System.out.println(data);}
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("sort  in default:"+list);
		
//		Collections.reverse(list);
//		System.out.println("reverse: "+list);
		
		//LinkList
		
		LinkedList<String> list1= new LinkedList<String>();
		list1.add("Viraj");
		list1.add("Dattatray");
		list1.add("Thale");
		list1.add("kunali");
		
		list1.addFirst("First");
		list1.addLast("End");
	
		System.out.println(list1);
		
		
		//Stack 
		
		Stack<String> stack =new Stack<String>();
		
		stack.push("Item1");
		stack.push("Item2");
		stack.push("Item3");
		stack.push("Item4");
		stack.push("item4");
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println("After pop element "+stack);
		
		
//Vector
		
		Vector<String> vector  = new Vector <String>();
		
		vector.add("ElementtVec1");
		vector.add("ElementtVec2");
		vector.add("ElementtVec3");
		
		System.out.println(vector);
		
		
		
		
		
		
		
		
		
	

	}

}
