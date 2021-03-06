package com.google.ex;
import java.util.Properties;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Enumeration;


public class PropertiesEx
{
	public static void main(String args[])
	{
		Properties props = new  Properties();

		props.put(1,"Srinu");
		props.put(16,"Uday");
		props.put(2,"Kavya");
		props.put(1,"Kalyan");
		props.put(3,"Srinu");
		props.put(6,"Akash");

		
		System.out.println(" \nIterate Elements using keySet");

		Set set  = props.keySet();

		for(Object key : set)
		{
			System.out.println(key + " : "+props.get(key));
		}

	}
}