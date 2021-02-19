package com.google.ex1;

class PrintNumber
{

	private int count = 1;

	private boolean oddFlag = true;


	public synchronized void printEven()
	{
		while(true)
		{
			if(oddFlag == false)
			{
			  System.out.println(Thread.currentThread().getName()+" : "+count);
				count = count + 1;
				oddFlag = true;
				this.notify(); // EvenThread send a notification to OddThread.
				
			}else
			{
				try
				{
					Thread.sleep(1000);
					this.wait();// wait() releases the lock from EvenThread, then keep EveThread in waiting state until OddThred Notifies it.

				}catch(InterruptedException exp)
				{
					System.out.println("Thread is Interrupted "+exp);
				}
				
			}
		}
	}

	public synchronized void printOdd()
	{

			while(true)
			{
				if( oddFlag == true)
				{
					System.out.println(Thread.currentThread().getName()+" : "+count);
					count = count + 1;
					oddFlag = false;
					
					// this.notify(); // As we don't call notify method, EvenThread always be in wainting state. It leads to Dead Lock.
					
				}else
				{

					try
				{
					Thread.sleep(1000);
					this.wait();// wait() releases the lock from EvenThread, then keep EveThread in waiting state until OddThred Notifies it.

				}catch(InterruptedException exp)
				{
					System.out.println("Thread is Interrupted "+exp);
				}
				}
			}

	}

}


class OddThread extends Thread
{
		private PrintNumber printNumber;

		public OddThread(PrintNumber printNumber){
			this.printNumber = printNumber;

		}

		public void run()
		{

		  printNumber.printOdd();
		}
}



class EvenThread extends Thread
{
		private PrintNumber printNumber;

		public EvenThread(PrintNumber printNumber){
			this.printNumber = printNumber;

		}

		public void run()
		{

		  printNumber.printEven();
		}
}


public class DeadLock
{
	public static void main(String args[])
	{
		PrintNumber printNumber = new PrintNumber();
		Thread t1 = new OddThread(printNumber);
		t1.setName("ODD Thread");
		t1.setPriority(Thread.MIN_PRIORITY);

		Thread t2 = new EvenThread(printNumber);
		t2.setName("EVEN Thread");
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
	}
}

















