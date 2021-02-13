package com.google.ex;


public class WrapperClassMethodsEx
{
	public static void main(String args[])
	{
		Integer v = new Integer(123);


		System.out.println( " v => "+v);

				

		System.out.println( "reverse(123) => "+Integer.reverse(v));

		System.out.println(" min(10,20) "+Integer.min(10,20));

		Byte b = v.byteValue();

		System.out.println(" b => "+b);


	}
}