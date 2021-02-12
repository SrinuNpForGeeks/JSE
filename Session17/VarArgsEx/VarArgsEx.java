package com.google.ex;


class Sample
{
	public void print( String... names)
	{
		System.out.println(" \n Var Args Demo");
		
			for(String n : names)
			{
				System.out.println(n);
			}
	}
}

public class VarArgsEx
{
	public static void main(String args[])
	{

		Sample s = new Sample();
		s.print();
		s.print("Srinu");
		s.print("Srinu","Kiran");
		s.print("Srinu","Kalyan","Kiran");

	}
}