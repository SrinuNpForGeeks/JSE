package com.google.ex;

public class StringBuilderEx
{
	public static void main(String args[])
	{

		StringBuilder s = new StringBuilder(" Uday");

		System.out.println(" Before Update => "+ s);
		s.append(" Welcome");
		System.out.println(" After Update => "+ s);


		StringBuilder s2 = new StringBuilder("Hi");

		s2.insert(0,"HYD=> ");
		System.out.println(s2);

	}
}