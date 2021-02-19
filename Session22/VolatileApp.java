package com.google.ex2;

class SampleCount
{

	private  int count = 10;
	private volatile boolean flag = false;


	public synchronized void increment()
	{

		++count;

		flag = true;
		
	}

	public  synchronized int getCount()
	{
		if(flag == true)
		{
			return count;
		}else
		{
			return 10;
		}

	}



}


class IncrementThread extends Thread
{
	SampleCount sampleCount ;
		
		public IncrementThread(SampleCount sampleCount)
		{
				this.sampleCount = sampleCount;
		}

		public void run()
		{
				sampleCount.increment();
		}
}


class GetDataThread extends Thread
{
	SampleCount sampleCount ;
		
		public GetDataThread(SampleCount sampleCount)
		{
				this.sampleCount = sampleCount;
		}
		
		public void run()
		{
				System.out.println(" Count From GetDataThread => "+sampleCount.getCount());
		}
}


public class VolatileApp
{
	public static void main(String args[])
	{
		SampleCount s = new SampleCount();

		Thread t1 = new IncrementThread(s);
		t1.setName("Increment -Thread");
		t1.setPriority(10);

		Thread t2 = new GetDataThread(s);
		t2.setName("GetDataThread");
		t2.setPriority(1);

		t1.start();
		t2.start();

		System.out.println(" Actual Count in SampleObject => "+s.getCount());
	}
}

















