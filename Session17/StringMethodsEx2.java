package com.google.ex;

public class StringMethodsEx2
{
	public static void main(String args[])
	{

		String s1 = " Welcome Hyd";

		System.out.println("s1.subString(3) => " + s1.substring(3)); // come Hyd
		System.out.println("s1.subString(3,7) => " + s1.substring(3,7)); // come
		System.out.println("s1.length(): "+s1.length()); //
		System.out.println("s1.contains(Hyd): "+s1.contains("Hyd"));// true

		System.out.println("s1.toCharArray()");
		char[] charArr = s1.toCharArray();

		for(char e :charArr)
		{
			System.out.println(e);
		}

		String s2 = "   Hi Welome   ";

		System.out.println("s2.length()" +s2.length());
	  System.out.println("s2.trim().length()" +s2.trim().length());



	}
}