package collection_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

import collection.stack;

public class Stack_pgm {
	public static void main(String[] args) {
		ArrayList<Comparable> a=new ArrayList<Comparable>();
		a.add(10);
		a.add(20);
		a.add("Ravi");
		a.add(10);
		
		HashSet h=new HashSet(a);
		System.out.println(h);
		
		Stack s=new Stack();
		s.add(10);
		s.add(11);
		s.add(13);
		s.push(15);
		s.push("Hello");
		s.push(true);
		System.out.println(s);
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

}
