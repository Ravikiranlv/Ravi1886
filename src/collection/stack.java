package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class stack {
   public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(10);
	t.add(20);
	t.add(50);
	t.add(2);
	t.add(10);
	t.add(100);
	System.out.println(t);
	Iterator i=t.descendingIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
