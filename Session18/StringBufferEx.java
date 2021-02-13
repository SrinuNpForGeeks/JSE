package com.google.ex;

public class StringBufferEx
{
	public static void main(String args[])
	{

		StringBuffer s = new StringBuffer(" Uday");

		System.out.println(" Before Update"+ s);
		s.append(" Welcome");
		System.out.println(" After Update"+ s);

	}
}