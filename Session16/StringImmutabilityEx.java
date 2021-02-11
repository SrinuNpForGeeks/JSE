package com.google.app;


public class StringImmutabilityEx
{
	public static void main(String args[])
	{

		String s = "Hi";

		System.out.println(" Before Change :: s = "+s);

		s.concat(" Welcome ");

		System.out.println(" After Change  & not assigning :: s = "+s);


		s = s.concat(" Welcome Uday");

	  System.out.println(" After Change  &  assigning :: s = "+s);


	}
}
