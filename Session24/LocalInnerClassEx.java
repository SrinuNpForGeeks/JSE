
package com.google.ex8;

class Outer
{



	public void getInfo()
	{

		  final int count = 10;

	class Inner
	
	{
		public void display()
		{
			System.out.println(" I am from  Local Inner Class :: count "+count);
		}
	}

	Inner i = new Inner();
	i.display();

	}

	 

}


public class LocalInnerClassEx
{
	public static void main(String args[])
	{
		
		Outer o = new Outer();
		o.getInfo();
	}
}