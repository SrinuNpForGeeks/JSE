package com.google.thred.ex2;


class SampleThred1 extends Thread
{

	public void run()
	{
		System.out.println(" Task1 Started => Task is Fetching Data From infinite Stream");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException exp)
		{
			System.out.println(exp);
		}
		System.out.println(" Task1 is Completed ");
	}
}


class SampleThred2 extends Thread
{

	public void run()
	{
		System.out.println(" Task2 Started !!! Process the Data by Colleting data from Task1 ");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException exp)
		{
			System.out.println(exp);
		}
		System.out.println(" Task2 is Completed ");
	}
}


class SampleThred3 extends Thread
{

	public void run()
	{
		System.out.println(" Task3 Started!!! Collecting Data from task2 then Publishing into Stream ");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException exp)
		{
			System.out.println(exp);
		}
		System.out.println(" Task3 is Completed ");
	}
}


public class ThreadEx2
{
	public static void main(String args[])
	{

		Thread t1 = new SampleThred1();
		t1.start();

		Thread t2 = new SampleThred2();
		t2.start();

		Thread t3 = new SampleThred3();
		t3.start();
	}
}



















