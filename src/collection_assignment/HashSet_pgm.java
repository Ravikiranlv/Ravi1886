package collection_assignment;

import java.util.HashSet;

public class HashSet_pgm {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(10);
		h.add(20);
		h.add("Hello");
		h.add(true);
		h.add(50);
		h.add(20);
		System.out.println(h);
		for (Object o : h) {
			System.out.println(o);
		}
	}
}
