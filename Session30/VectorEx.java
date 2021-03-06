package com.google.ex;

import java.util.List;
import java.util.Vector;
import java.util.ListIterator;

public class VectorEx
{

	public static void main(String args[])
	{
		List<String> list  = new Vector<String>();

		list.add("Srinu");

		list.add("Kiran");
		list.add(null);
		list.add("Srinu");

		System.out.println(" ArrayList Data => "+list);

		list.add(1,"Kavya");

		System.out.println(" ArrayList Data after add(1,Kavya) => "+list);


		list.set(1,"Uday");
		System.out.println(" ArrayList Data after set(1,Uday) => "+list);


		System.out.println(" Element at index 2 => "+list.get(2));


		System.out.println("index Of Srinu=> "+list.indexOf("Srinu"));

		System.out.println("lastIndexOf Srinu=> "+list.lastIndexOf("Srinu"));

		System.out.println("Remove element form index 0 => "+list.remove(0));

		System.out.println(" Elements in the List after Remove ::  "+list);


		ListIterator listItr = list.listIterator();
		System.out.println(" \nReading data in Forward");

		while(listItr.hasNext())
		{
			System.out.println(listItr.next());
		}


		System.out.println(" \nReading data in Back");

		while(listItr.hasPrevious())
		{
			System.out.println(listItr.previous());
		}


	}
}