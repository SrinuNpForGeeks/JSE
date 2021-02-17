package com.google.ex1;

class PrintNumbersTask extends Thread
{
	
	public void run()
	{
		for(int i = 1 ; i <= 10 ; i++)
			{
			System.out.println(Thread.currentThread().getName()+ " :: "+i);
			}
	}
}


public class SingleTaskWithMultipleThreads
{
	
	public static void main(String args[])
	{

	Thread t1 = new PrintNumbersTask();
    t1.setName(" Thread-01");

	Thread t2 = new PrintNumbersTask();
    t2.setName(" Thread-02");

    t1.start();
    t2.start();

	}
}
