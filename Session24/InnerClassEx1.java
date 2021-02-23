
package com.google.ex6;

class Outer
{

	public void getInfo()
	{
		System.out.println(" I am from Outer Class");
	}

	class Inner
	{
		public void display()
		{
			System.out.println(" I am from Inner Class");
		}
	}

}


public class InnerClassEx1
{
	public static void main(String args[])
	{

		Outer o = new Outer();
		o.getInfo();

		Outer.Inner  i = o.new Inner(); 
		i.display();
	}
}