package com.google.ex1;

class Sample
{
	public Sample()
		{
		System.out.println(" Sample Object is Created ");
		}

	public void finalize()
	{
	System.out.println(" From finalize() Object is removed");
	}
}


public class GarbaseCollectorEx1
{
	
	public static void main(String args[])
	{
	 Sample s = new Sample();
	 s = null;
	 System.gc();
	}
}