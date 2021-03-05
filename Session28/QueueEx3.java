package com.google.ex;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueEx3
{

	public static void main(String args[])
	{

		Queue<Character> queue = new PriorityQueue<Character>();

	
		queue.offer('a');
		queue.offer('A');
		queue.offer('b');
		queue.offer('B');
		queue.offer('u');
		queue.offer('U');

		System.out.println(" First Element in Queue :: "+queue.peek()); // 'A'
		System.out.println("Elements in Queue  Before Remove: "+queue);

		System.out.println(" Remove First Element in Queue :: "+queue.poll()); // 'A'
		System.out.println("Elements in Queue  After Remove: "+queue);

		System.out.println(" Remove 2nd Element in Queue :: "+queue.poll()); // 'B'
		System.out.println("Elements in Queue  After Remove: 2nd Element "+queue);


		System.out.println(" U char contains "+queue.contains('U'));





	}
}