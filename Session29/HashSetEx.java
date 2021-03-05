package com.google.ex;
import java.util.Set;
import java.util.HashSet;

public class HashSetEx
{
	public static void main(String args[])
	{

		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		
		set.add(102);

		set.add(120);

		set.add(12);

		set.add(14);

		set.add(10);

		set.add(12);

		set.add(1);

		set.add(2);

		set.add(12);

		set.add(null);

		System.out.println(" Elements in HashSet are => "+set);

		System.out.println(" Element 10 preset  ?  => "+set.contains(10));

		System.out.println(" Remove Element 10  1st Time ?  => "+set.remove(10));

		System.out.println(" Remove Element 10  2nd Time ?  => "+set.remove(10));

		System.out.println(" After remove Elements in HashSet are => "+set);


	}
}
