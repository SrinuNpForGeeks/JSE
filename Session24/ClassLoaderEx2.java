package com.google.ex5;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


class Sample
{

	private Integer count;
	private String name;

	public Sample()
	{

	}

	public Sample(String  name)
	{

	}
	
	public void print(){

	}

	public void print(String name){

	}
}



public class ClassLoaderEx2
{
	
	public static void main(String args[])
	{ 
	
	 
	 System.out.println(" String => ClassLoader "+String.class.getClassLoader()); // returns  null, As the String.class file loaded by either Extention or BootStrap ClassLoaders thhey were implemented in c/c++

	 System.out.println(" Sample => ClassLoader "+Sample.class.getClassLoader()); // O/P ApplicationClassLoader

	}
}