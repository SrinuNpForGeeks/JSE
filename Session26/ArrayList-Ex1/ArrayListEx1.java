package com.google.ex1;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1
{

	public static void main(String args[])
	{
		Collection list1  = new ArrayList();

		list1.add(1);
		list1.add(2);
		list1.add("Srinu");
		list1.add(true);
		list1.add("Srinu");
		list1.add(null);

		System.out.println(" Size Of List1 => "+list1.size()); // 6

		System.out.println(" 2 contains in List1  => "+list1.contains(2)); // true

		System.out.println(" list1 is Empty  => "+list1.isEmpty()); // false

		System.out.println(" removing 2 from list1  => "+list1.remove(2));  // true

		System.out.println(" removing element 2 from list1 second time => "+list1.remove(2));  // false




		Collection list2  = new ArrayList();

		list2.add(10);
		list2.add(20);
		list2.add("Uday");
		list2.add(false);
		list2.add("Srinu");
		list2.add(null);


		list1.addAll(list2);


		System.out.println(" list2 present  in list1  => "+list1.containsAll(list2)); // true



		System.out.println(" \n Elements in List1 are using Iterator");


		Iterator itr = list1.iterator();


		while(itr.hasNext())
		{
			Object element  = itr.next();
			System.out.println(element);
		}

		
		System.out.println(" \n Elements in List1 are using Enhanced For Loop");

		for(Object element : list1)
		{
			System.out.println(element);
		}


	}
}