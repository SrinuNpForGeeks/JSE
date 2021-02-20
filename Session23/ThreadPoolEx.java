package com.google.ex1;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;


class SampleThred implements Runnable
{
	private int task;

	public SampleThred(int task)
	{
		this.task = task;
	}

	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " Running => Task = "+task);
	}
}



public class ThreadPoolEx
{
	public static void main(String args[])
		{

			ExecutorService service = Executors.newFixedThreadPool(3);

			Runnable task1 = new SampleThred(1);
			
			Runnable task2 = new SampleThred(2);

			Runnable task3 = new SampleThred(3);

			Runnable task4 = new SampleThred(4);

			Runnable task5 = new SampleThred(5);


			service.execute(task1);
						
			service.execute(task2);

			service.execute(task3);

			service.execute(task4);

			service.execute(task5);

			service.shutdown();

		}
}