package com.google.ex;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2
{

	public static void main(String args[])
	{
		Collection<String> list  = new ArrayList<String>();

		list.add("Srinu");
		list.add("Kriran");
		list.add(null);

		Iterator<String> itr = list.iterator();


		System.out.println(" \n Getting with iterator");

		while(itr.hasNext())
		{
		String element = itr.next();
		System.out.println(element);
		}

		System.out.println(" \n Getting with Enhanced For loop");


		for(String element: list)
		{
			System.out.println(element);
		}


	}
}