package com.google;

public class Sample
{

	static
	{
		System.out.println(" Sample static block :: class is loaded");
	}

	public Sample(String msg)
	{
		System.out.println(" Sample Object is created ");
	}

	public Sample()
	{
		System.out.println(" Sample Object is created ");
	}

	public void getInfo()
	{
		System.out.println(" Sample getInfo() is invoked ");
	}
}