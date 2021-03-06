package com.google.ex;

import java.util.*;

public class ImmutableCollectionEx
{

	public static void main(String args[])
	{
		
		List<String> list = List.of("Venu","Akash","Uday","Kavya","Uday");
		System.out.println("List Data "+list);


		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);

		System.out.println("List2 Data "+list2);


		List<Integer> imutableList = List.copyOf(list2);

		Set<String> set = Set.of("Venu","Akash","Uday","Kavya");
		System.out.println("Set Data "+set);


		Map<Integer,String> map = Map.of(1,"Srinu",2,"Uday",3, "Kavya");
		System.out.println(" Map Data "+map);

	}
}