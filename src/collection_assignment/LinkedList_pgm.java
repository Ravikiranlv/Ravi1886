package collection_assignment;
/*

[10, 11, Hello, 10]
10
11
Hello
10

 */
import java.util.LinkedList;
/**
 * 
 * @author ravik
 *
 */
public class LinkedList_pgm {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.offer(11);
		l.offer("Hello");
		l.offer(10);
		System.out.println(l);
		while(!l.isEmpty())
		{
			System.out.println(l.poll());
		}
	}

}
