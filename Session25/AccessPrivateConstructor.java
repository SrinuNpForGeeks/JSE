
package com.google.ex3;
import java.lang.reflect.Constructor;

class Sample
{

private Sample()
{
		System.out.println(" From private default constructor");
}

private Sample(String name)
{
		System.out.println(" From private Parameterised constructor ::  name = "+name);
}


private Sample(String name,Integer no)
{
		System.out.println(" From private Parameterised constructor ::  name = "+name+" no ="+no);
}

}


public class AccessPrivateConstructor
{

	public static void main(String args[]) throws Exception
	{

		Class c = Class.forName("com.google.ex3.Sample");

		Constructor<Sample> cos1 = c.getDeclaredConstructor();
		cos1.setAccessible(true);
		cos1.newInstance();


		Constructor<Sample> cos2 = c.getDeclaredConstructor(String.class);
		cos2.setAccessible(true);
		cos2.newInstance("Kavya");

		Constructor<Sample> cos3 = c.getDeclaredConstructor(String.class,Integer.class);
		cos3.setAccessible(true);
		cos3.newInstance("Kavya",1242);

	}
}