package logics;

/*
  Question:- Program for time taken by Arraylist and Linked list to add and remove elements and record time at present  
  
  o/p:-
  
  Insert ArrayList takes 504ms
  Insert LinkedList takes 2194ms
  remove ArrayList takes 13ms
  Remove LinkedList takes 2208ms
 */
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author ravik
 *
 */
public class Time_taken_for_arraylist_LinkedList_and_remove {
	public static void main(String[] args) {
		long n = (long) 1E7;
		ArrayList array1 = new ArrayList();
		long miles = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			array1.add(i);
		}
		System.out.println("Insert ArrayList takes " + (System.currentTimeMillis() - miles + "ms"));

		LinkedList array2 = new LinkedList();
		long miles2 = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			array2.add(i);
		}
		System.out.println("Insert LinkedList takes " + (System.currentTimeMillis() - miles2 + "ms"));

		miles = System.currentTimeMillis();
		array1.remove(0);
		System.out.println("Remove ArrayList takes " + (System.currentTimeMillis() - miles + "ms"));

		miles = System.currentTimeMillis();
		array2.remove(0);
		System.out.println("Remove LinkedList takes " + (System.currentTimeMillis() - miles2 + "ms"));
	}
}
