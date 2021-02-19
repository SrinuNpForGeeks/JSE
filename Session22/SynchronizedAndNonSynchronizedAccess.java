package com.google.ex3;

class SampleCount
{


	public synchronized void printTable(int n)
	{
		for(int i = 1 ; i < 10 ; i++)
			{
				System.out.println(" From synchronized Block :: "+Thread.currentThread().getName()+" : = "+n+ " * "+i+ "="+ (n*i));

				try
				{
					Thread.sleep(3000);
				}catch(Exception exp){

				}
				
			}
	}


	public void demo()
	{
		for(int i = 1 ; i < 10 ; i++)
			{
				System.out.println(" From Non-Synchronized Block ::"+Thread.currentThread().getName()+" i = "+i);

				try
				{
					Thread.sleep(1000);
				}catch(Exception exp){

				}
				
			}
	}


}


class SynchronizedThread extends Thread
{
	SampleCount sampleCount ;
	private int n;
		
		public SynchronizedThread(SampleCount sampleCount,int n)
		{
				this.sampleCount = sampleCount;
				this.n = n;
		}

		public void run()
		{
				sampleCount.printTable(n);
		}
}


class NonSynchronizedThread extends Thread
{
	SampleCount sampleCount ;
		
		public NonSynchronizedThread(SampleCount sampleCount)
		{
				this.sampleCount = sampleCount;
		}
		
		public void run()
		{
				sampleCount.demo();
		}
}


public class SynchronizedAndNonSynchronizedAccess
{
	public static void main(String args[])
	{
		SampleCount s = new SampleCount();

		Thread t1 = new SynchronizedThread(s,1);
		t1.setName(" Thread 1");
		
		Thread t2 = new SynchronizedThread(s,2);
		t2.setName(" Thread 2");

		Thread t3 = new SynchronizedThread(s,3);
		t3.setName(" Thread 3");

		t1.start();
		t2.start();
		t3.start();


		Thread t4 = new NonSynchronizedThread(s);
		t4.setName(" DemoThread");
		t4.start();

	}
}

















