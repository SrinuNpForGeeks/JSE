package com.google.ex;
import java.util.Queue;
import java.util.LinkedList;

public class QueueEx1
{

	public static void main(String args[])
	{

		Queue<Integer> queue = new LinkedList<Integer>();

		queue.offer(1);
				
		queue.offer(2);

		queue.offer(3);

		queue.offer(4);

		queue.offer(3);

		queue.add(8);

		queue.add(null);

		System.out.println(" Elements in a Queue  Before Remove :: "+queue);

		System.out.println(" Delete 1st Element From a Queue :: "+queue.poll());

		System.out.println(" Delete 2nd Element From a Queue :: "+queue.poll());

		System.out.println(" Elements in a Queue  After Remove :: "+queue);




	}
}