package com.google.ex;

public class ReverseStringEx
{
	public static void main(String args[])
	{
			String s = "Welcome";
			int n = s.length() - 1;

			System.out.println(" \nWith For Loop => ");
			for( int i = n ; i >= 0 ; i-- )
			{
				System.out.print(s.charAt(i));
			}


			StringBuffer sb = new StringBuffer(s);
			System.out.println(" \nReverse with Sb :: "+sb.reverse());
	}
}