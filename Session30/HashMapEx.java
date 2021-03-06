package com.google.ex;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapEx
{
	public static void main(String args[])
	{
		Map<Integer,String> map = new  HashMap<Integer,String>();

		map.put(1,"Srinu");
		map.put(16,"Uday");
		map.put(2,"Kavya");
		map.put(1,"Kalyan");
		map.put(3,"Srinu");
		map.put(null,"Akash");
		map.put(5, null);
		map.put(6,"Akash");

		System.out.println (" isEmpty() => "+map.isEmpty());
		System.out.println (" size() => "+map.size());

		System.out.println (" containsKey(1) => "+map.containsKey(1));
		System.out.println (" containsValue(Srinu) => "+map.containsValue("Srinu"));

		System.out.println(" \nIterate Elements using keySet");

		Set<Integer> set  = map.keySet();

		for(Integer key : set)
		{
			System.out.println(key + " : "+map.get(key));
		}

		System.out.println(" \nIterate Elements using entrySet");

		Set< Map.Entry<Integer,String> >  meSet = map.entrySet();

		for(Map.Entry me: meSet)
		{
			System.out.println(me.getKey() + " : "+me.getValue());
		}



	}
}