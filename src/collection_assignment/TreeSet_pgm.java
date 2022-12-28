package collection_assignment;
/*

[5, 10, 20, 50]
50
20
10
5

 */
import java.util.Iterator;
import java.util.TreeSet;
/**
 * 
 * @author ravik
 *
 */
public class TreeSet_pgm {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(5);
		t.add(50);
		t.add(5);
		System.out.println(t);
		Iterator i = t.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
