package com.google.thred.ex1;


class SampleThred1 implements Runnable
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


class SampleThred2 implements Runnable
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


class SampleThred3 implements Runnable
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


public class ThreadEx1
{
	public static void main(String args[])
	{
		SampleThred1 s1 = new SampleThred1();
		Thread t1 = new Thread(s1);
		t1.start();

		SampleThred2 s2 = new SampleThred2();
		Thread t2 = new Thread(s2);
		t2.start();

		SampleThred3 s3 = new SampleThred3();
		Thread t3 = new Thread(s3);
		t3.start();
	}
}



















