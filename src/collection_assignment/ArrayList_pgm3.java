package collection_assignment;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.event.ListDataEvent;

public class ArrayList_pgm3 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("RAvi");
		a.add(true);
		a.add(10);
		a.add(50);
		System.out.println(a);
		a.add(1,100);
		System.out.println(a);
		a.set(1, 200);
		System.out.println(a);
		
	}

}
