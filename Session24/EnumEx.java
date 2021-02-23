package com.google.ex5;

enum Fruits
{

APPLE("RED") , ORANGE("Orange"), BANANA("Yellow");
private String value;

private Fruits(String value)
{
	this.value = value;
}

public String getValue()
{
	return value;
}
	
}

/*

 class Fruits extends Enum
 {
 	private String value;
	public static final Fruits APPLE = new Fruits("RED");
	public static final Fruits ORANGE = new Fruits("Orange");
	public static final Fruits BANANA = new Fruits("Yellow");

 }

*/


public class EnumEx
{
	public static void main(String args[])
	{

		System.out.println(Fruits.APPLE.name() + " : "+Fruits.APPLE.getValue());
		
		System.out.println(Fruits.ORANGE.name() + " : "+Fruits.ORANGE.getValue());

		System.out.println(Fruits.BANANA.name() + " : "+Fruits.BANANA.getValue());



	}
}