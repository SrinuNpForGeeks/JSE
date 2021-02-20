package com.google.ex2;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.ArrayList;


class PrintTask implements Callable<String>

{

	 volatile int count = 0;

public String call()
{
	int n = count++;
	String threadName = Thread.currentThread().getName();
	try{
		Thread.sleep(2000);

	}catch(Exception exp){}

	return threadName +" : n = "+n;
}

}


public class CallableTaskEx
{

	public static void main(String args[]) throws Exception
	{

		ExecutorService service = Executors.newFixedThreadPool(10);

		ArrayList<Future<String>> futureList = new ArrayList<>();

		PrintTask task = new PrintTask();
		for( int i = 0; i < 100 ; i++)
		{
		 Future<String> future = service.submit(task);
		 futureList.add(future);
		}

		for(int i = 0 ; i < 100 ; i++)
		{

			Future<String> future =	futureList.get(i);
			System.out.println(future.get());
		}
		service.shutdown();
	}
}











