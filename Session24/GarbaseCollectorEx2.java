package com.google.ex2;

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


public class GarbaseCollectorEx2
{
	
	public static void main(String args[])
	{
	 Sample s1 = new Sample();
		s1 = new Sample(); // s1 is pointing to Second Object , then First Object un referenced so that First Object eleigible for Garbase Collection. 
	 System.gc();
	}
}