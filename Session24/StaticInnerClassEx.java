
package com.google.ex7;

class Outer
{


	static class Inner
	{
		public void display()
		{
			System.out.println(" I am from  Static Inner Class");
		}


	public static void getInfo()
			{
		System.out.println(" I am from Static Inner Class getInfo() ");
			}
	}

}


public class StaticInnerClassEx
{
	public static void main(String args[])
	{

		
		Outer.Inner  i = new Outer.Inner(); 
		i.display();

		Outer.Inner.getInfo();
	}
}