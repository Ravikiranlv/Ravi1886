package collection_assignment;

import java.util.PriorityQueue;

public class PrioriryQue_pgm {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		p.offer(10);
		p.offer(20);
		p.offer(10);
		p.offer(2);
		p.add(1);
		p.offer(6);
		System.out.println(p);
		while(!p.isEmpty())
		{
			System.out.println(p.poll());
		}
	}

}
