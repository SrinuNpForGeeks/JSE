package com.google.ex3;

class PrintEvenTask extends Thread
{
	
	public void run()
	{
		for(int i = 1 ; i <= 10 ; i++)
			{
				if( i%2 == 0)
				{
						System.out.println(Thread.currentThread().getName()+ " :: "+i);

				}
					try
						{
							Thread.sleep(1000);

						}catch(Exception exp)
						{
							System.out.println(exp);
						}
			}
	}
}


class PrintOddTask extends Thread
{
	
	public void run()
	{
		for(int i = 1 ; i <= 10 ; i++)
			{
				if( i%2 == 1)
				{
						System.out.println(Thread.currentThread().getName()+ " :: "+i);

				}
					try
						{
							Thread.sleep(1000);

						}catch(Exception exp)
						{
							System.out.println(exp);
						}
			}
	}
}


public class MultipleTaskWithMultipleThreads
{
	
	public static void main(String args[]) throws Exception
	{

	Thread t1 = new PrintEvenTask();
	t1.setName("EvenThread");
	t1.setPriority(Thread.NORM_PRIORITY); // NORM_PRIORITY = 5

	Thread t2 = new PrintOddTask();
	t2.setName("OddThread");
	t2.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10

	t1.start();
	t2.start();

	}
}






