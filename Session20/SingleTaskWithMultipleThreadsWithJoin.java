package com.google.ex2;

class PrintNumbersTask extends Thread
{
	
	public void run()
	{
		for(int i = 1 ; i <= 10 ; i++)
			{
			System.out.println(Thread.currentThread().getName()+ " :: "+i);
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


public class SingleTaskWithMultipleThreadsWithJoin
{
	
	public static void main(String args[]) throws Exception
	{

	Thread t1 = new PrintNumbersTask();
    t1.setName(" Thread-01");


	Thread t2 = new PrintNumbersTask();
    t2.setName(" Thread-02");

    Thread t3 = new PrintNumbersTask();
    t3.setName(" Thread-03");

    t1.start();    t1.join();


    t2.start();
    t3.start();

	}
}
