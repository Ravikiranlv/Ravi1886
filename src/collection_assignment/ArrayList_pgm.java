package collection_assignment;

import java.util.ArrayList;

public class ArrayList_pgm {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println(a.isEmpty());
		a.add(10);
		a.add(20);
		a.add("Hello");
		a.add(10);
		System.out.println(a);
		System.out.println("The Elements are : ");
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("Itarating the value using for each loop : ");
		for(Object o:a)
		{
			System.out.println(o);
		}
		
	}

}
