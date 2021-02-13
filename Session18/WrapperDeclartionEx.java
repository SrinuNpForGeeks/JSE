package com.google.ex;

class Sample
{

	private Integer count;
	private Float price;
	private Boolean flag;

public Sample()
{
	flag = true;
}

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(" [ count = "+count);
		sb.append(" , price = "+count);
		sb.append(" , flag = "+flag);
		sb.append(" ] ");

		return sb.toString();
	}
}

public class WrapperDeclartionEx
{
	public static void main(String args[])
	{
		Sample s = new Sample();

		System.out.println(s);

	}
}