package com.google.ex;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Enumeration;


public class HashTableEx
{
	public static void main(String args[])
	{
		Hashtable<Integer,String> hashTable = new  Hashtable<Integer,String>();

		hashTable.put(1,"Srinu");
		hashTable.put(16,"Uday");
		hashTable.put(2,"Kavya");
		hashTable.put(1,"Kalyan");
		hashTable.put(3,"Srinu");
		hashTable.put(6,"Akash");

		System.out.println (" isEmpty() => "+hashTable.isEmpty());
		System.out.println (" size() => "+hashTable.size());

		System.out.println (" containsKey(1) => "+hashTable.containsKey(1));
		System.out.println (" containsValue(Srinu) => "+hashTable.containsValue("Srinu"));

		System.out.println(" \nIterate Elements using keySet");

		Set<Integer> set  = hashTable.keySet();

		for(Integer key : set)
		{
			System.out.println(key + " : "+hashTable.get(key));
		}

		System.out.println(" \nIterate Elements using entrySet");

		Set< Map.Entry<Integer,String> >  meSet = hashTable.entrySet();

		for(Map.Entry me: meSet)
		{
			System.out.println(me.getKey() + " : "+me.getValue());
		}

		System.out.println(" \nIterate Elements using Enumeration");


		Enumeration<Integer> enumerator = hashTable.keys();

		while(enumerator.hasMoreElements())
		{
			Integer key = enumerator.nextElement();
		   System.out.println(key + " : "+hashTable.get(key));

		}

	}
}