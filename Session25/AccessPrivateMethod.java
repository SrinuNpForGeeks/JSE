
package com.google.ex2;
import java.lang.reflect.Method;

class Sample
{


	private void display()
	{
		System.out.println(" private display()  method is Accessed");
	}

	private void display(String name)
	{
		System.out.println(" private display(String)  method is Accessed, name = "+name);
	}
}


public class AccessPrivateMethod
{

	public static void main(String args[]) throws Exception
	{

		Sample s = new Sample();

		Class c =  s.getClass();

		Method m1 = c.getDeclaredMethod("display");

		m1.setAccessible(true);

		m1.invoke(s);


		Method m2 = c.getDeclaredMethod("display",String.class);

		m2.setAccessible(true);

		m2.invoke(s,"Uday");

		

	}
}