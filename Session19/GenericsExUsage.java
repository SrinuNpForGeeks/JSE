package com.google.generic.ex;

class Sample<T>
{

private T  data;

public Sample()
{

}

public Sample(T data)
{
	this.data = data;
}
	
public T getData()
	{
		return data;
	}

public void setData(T data)
{
	this.data = data;
}

}



public class GenericsExUsage
{
	public static void main(String args[])
	{
			Sample<Integer> s1 = new Sample<Integer>();
			s1.setData(12);

		

			Sample<String> s2 = new Sample<String>();
			s2.setData("Srinu");

			System.out.println(" s1 data : "+s1.getData());
			System.out.println(" s2 data : "+s2.getData());

	}
}













