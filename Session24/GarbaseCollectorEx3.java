package com.google.ex3;

class Sample1
{
	private Sample2 s2;

	public Sample1()
	{

	}
	public Sample1(Sample2 s2)
		{
			this.s2 = s2;
		System.out.println(" Sample1 Object is Created ");
		}

	public void finalize()
	{
	System.out.println(" From finalize()  Sample1 Object is  removed");
	}
}

class Sample2
{
	private Sample1 s1;
	public Sample2()
	{
		
	}
	public Sample2(Sample1 s1)
		{
			this.s1 = s1;
		System.out.println(" Sample2 Object is Created ");
		}

	public void finalize()
	{
	System.out.println(" From finalize() Sample2 Object is removed");
	}
}


public class GarbaseCollectorEx3
{
	
	public static void main(String args[])
	{
	 	Sample1 s1Ref = new Sample1();
	   Sample2 s2Ref = new Sample2();

	 	new Sample1( s2Ref);
	 	new Sample2( s1Ref );

	 	System.gc();
	}
}