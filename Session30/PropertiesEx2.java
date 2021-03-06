package com.google.ex;
import java.util.Properties;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Enumeration;
import java.io.InputStream;
import java.io.FileInputStream;


public class PropertiesEx2
{
	public static void main(String args[]) throws Exception
	{


		InputStream fin = new FileInputStream("Creds.properties");

		Properties props = new  Properties();
		props.load(fin);

		Set<String> set = props.stringPropertyNames();

		for(String key : set)
		{
			System.out.println(key + " : "+props.get(key));
		}

	}
}