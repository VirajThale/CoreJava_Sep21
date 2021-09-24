package test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		
		PriorityQueue<String> q1 =new PriorityQueue<String>();
		q1.add("name1");
		q1.add("name2");
		q1.add("name3");
		q1.add("name4");
		//q1.add(null);  //can not store null value 
		
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println("After poll :"+q1);
		
		ArrayDeque<String> q2 = new ArrayDeque <String>();
		q2.add("ele1");
		q2.add("ele2");
		q2.add("ele3");
		q2.add("ele4");
		
		System.out.println(q2.peekFirst());
		System.out.println(q2.peekLast());
		System.out.println(q2);
		
		
		
	}

}
