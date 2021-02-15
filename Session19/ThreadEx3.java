package com.google.thred.ex3;


class SampleThred1 extends Thread
{

	

	public void run()
	{
		System.out.println(Thread.currentThread().getName() + " Started");

		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getState());


		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException exp)
		{
			System.out.println(exp);
		}
		System.out.println(Thread.currentThread().getName() + " Ended");
	}

	
}



public class ThreadEx3
{
	public static void main(String args[])
	{

		System.out.println(Thread.currentThread().getName() + " Thread => Started");

	    System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getState());


		Thread t1 = new SampleThred1();
		t1.setName(" SampleThread-01 ");
		t1.start();

		System.out.println(Thread.currentThread().getName() + " Thread => Ended");

	}
}



















