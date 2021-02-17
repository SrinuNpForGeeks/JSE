package com.google.ex4;

class PrintTable
	{

public void print(int n)
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




public class NoSychronizationApp
{
	
	public static void main(String args[]) throws Exception
	{

		PrintTable table = new PrintTable();

		Thread t1 = new PrintTableThread(table, 1);
		Thread t2 = new PrintTableThread(table, 2);
		t1.start();
		t2.start();


	}
}






