package com.google.ex;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueEx2
{

	public static void main(String args[])
	{

		Queue<Integer> queue = new PriorityQueue<Integer>();

	

		queue.add(8);

		queue.offer(2);

	    queue.offer(4);
	    
	    queue.offer(1);

	    queue.offer(3);

	    queue.offer(1);


	


		//queue.add(null);

		System.out.println(" Elements in a Queue  Before Remove :: "+queue);

		System.out.println(" Delete 1st Element From a Queue :: "+queue.poll());
		System.out.println(" Elements in a Queue  After 1st Remove :: "+queue);


		System.out.println(" Delete 2nd Element From a Queue :: "+queue.poll());
		System.out.println(" Elements in a Queue  After 2nd Remove :: "+queue);


		System.out.println(" Delete 3nd Element From a Queue :: "+queue.poll());
		System.out.println(" Elements in a Queue  After 3rd Remove :: "+queue);

		System.out.println(" Delete 4th Element From a Queue :: "+queue.poll());
		System.out.println(" Elements in a Queue  After 4th Remove :: "+queue);

		System.out.println(" First Element in queue :: "+queue.peek());
		System.out.println(" First Element in queue :: "+queue.element());





	}
}