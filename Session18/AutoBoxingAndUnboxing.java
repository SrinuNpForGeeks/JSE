package com.google.ex;

public class AutoBoxingAndUnboxing
{
	public static void main(String args[])
	{
			int count = 10; // primitive type declartion

			Integer c2 = count; // AutoBoxing

			int c3 = c2; // UNBoxing

			System.out.println( " c2 => "+c2);
			System.out.println( " c3 => "+c3);

	}
}