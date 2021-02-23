
package com.google.ex10;


interface Sample
{
	public abstract void getInfo();
}


public class AnnonymousInnerClassEx
{
	public static void main(String args[])
	{

		Sample s = new Sample()
					{
							public void getInfo()
							{
								System.out.println(" From AnnonymousInnerClass getInfo() ");
							}
					};

		s.getInfo();
	}
}

