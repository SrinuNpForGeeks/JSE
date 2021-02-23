
package com.google.ex9;

interface Outer
{

public abstract void getInfo();


interface Inner
{
	public abstract void display();
}


}



class OuterImpl implements Outer
{
	public void getInfo()
		{
			System.out.println(" From Outer :: getInfo() method ");
		}
}


class InnerImpl implements Outer.Inner
{
public void display()
		{
			System.out.println(" From Inner :: display() method ");
		}

}


public class NesteadInterfaceApp
{
	public static void main(String args[])
	{
		
		Outer o = new OuterImpl();
		o.getInfo();

		Outer.Inner i = new InnerImpl();
		i.display();
	}
}








