package com.google.app;


public class StringComparisionEx
{
	public static void main(String args[])
	{

		String s1 = "Hi"; // Creating String object using Literal

		String s2 = "Hi"; 

		String s3 = new String("Hi"); // Creating String object using new keyword
		String s4 = new String("Hi");
 
		System.out.println(" s1 == s2 " + (s1 == s2));
		System.out.println(" s1 == s3 " + (s1 == s3));
		System.out.println(" s3 == s4 " + (s3 == s4));

		System.out.println(" s1.equals(s2) " +  s1.equals(s2));
		System.out.println("  s1.equals(s3)" +  s1.equals(s3));
		System.out.println("  s3.equals(s4)" +  s3.equals(s4));

		

	}
}
