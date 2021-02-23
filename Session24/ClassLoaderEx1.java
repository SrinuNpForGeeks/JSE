package com.google.ex4;
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



public class ClassLoaderEx1
{
	
	public static void main(String args[])
	{ 
		Sample s = new Sample();
	 	
	 Class  c =	s.getClass();

	Field[] fieldArray = c.getDeclaredFields();
	
	Constructor[] constructorArray = c.getDeclaredConstructors();

	Method[] methodArray = c.getDeclaredMethods();

	System.out.println(" \n Sample Class Instance Variables :: ClassName " +c.getName());



	for(Field  f : fieldArray)
	{
		System.out.println(f);
	}


	System.out.println(" \n Sample Class Methods");

	for(Method  m : methodArray)
	{
		System.out.println(m);
	}


	System.out.println(" \n Sample Class Constructors");

	for(Constructor  con : constructorArray)
	{
		System.out.println(con);
	}



	}
}