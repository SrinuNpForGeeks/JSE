
package com.google.ex1;
import java.lang.reflect.Field;

class Sample
{
	private int count = 10;


	public int getCount()
	{
		return count;
	}
}


public class AccessPrivateField
{

	public static void main(String args[]) throws Exception
	{

		Sample s = new Sample();

		System.out.println(" From Sample Object count : = "+s.getCount());

		Class c =  s.getClass();

		Field f = c.getDeclaredField("count");

		f.setAccessible(true);

		Integer countAcc = f.getInt(s);

		System.out.println(" count Accessed through Reflection API "+countAcc);

		

	}
}