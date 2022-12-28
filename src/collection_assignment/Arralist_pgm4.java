package collection_assignment;

import java.util.ArrayList;

public class Arralist_pgm4 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		for(Integer i:a)
		{
			System.out.println(i);
		}
		System.out.println(a.contains(10));
		ArrayList a1=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(100);
		System.out.println(a1.containsAll(a));
		System.out.println(a.containsAll(a1));
	}

}
