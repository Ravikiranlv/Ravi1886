package collection_assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_pgm2 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("Hello");
		a.add(true);
		a.add(10);
		a.add(50);
		
		a.remove(2);
		System.out.println(a);
		
		a.remove("Hello");
		System.out.println(a);
		a.remove(new Integer(10));
		System.out.println(a);
	}

}
