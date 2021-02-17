package com.google.ex6;

class PrintTable
	{

public  void print(int n)
{
	System.out.println(Thread.currentThread().getName() + " Entered");


synchronized(this)
				{
		

	for(int i = 1 ; i <= 10 ; i++)
	{

		System.out.println(n + " * " + i + " = " + (n*i));
	

		try{
			Thread.sleep(1000);
		}catch(InterruptedException exp){
			System.out.println(exp);
		}
	}

	          }
}

   }

 class PrintTableThread extends Thread
 {
 	private PrintTable table;
 	private int n;

 	public PrintTableThread(PrintTable table,int n)
 	{
 		this.table = table;
 		this.n = n;
 	}

 	public void run()
 	{
 		table.print(n);
 	}
 }




public class SychronizationBlockLevelApp
{
	
	public static void main(String args[]) throws Exception
	{

		PrintTable table = new PrintTable();

		Thread t1 = new PrintTableThread(table, 1);
		Thread t2 = new PrintTableThread(table, 2);
		Thread t3 = new PrintTableThread(table, 3);
		Thread t4 = new PrintTableThread(table, 4);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();



	}
}






