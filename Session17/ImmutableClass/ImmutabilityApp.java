package com.google.app;
import com.google.ex.Person;
import com.google.ex.Address;


public class ImmutabilityApp
{
	
	public static void main(String args[]) throws Exception
	{

	Address addr = new Address("Hyd",500019l);

	Person p = new Person(111,"Uday",addr);

	System.out.println(" Person Data Before Addr Change ");
	System.out.println(p.getPersonId() + " : " +p.getPersonName()+ " : "+p.getAddress().getCity()+" : "+p.getAddress().getZipcode());

	p.getAddress().setCity(" New York ");

	System.out.println("\nPerson Data After Addr Change ");

	System.out.println(p.getPersonId() + " : " +p.getPersonName()+ " : "+p.getAddress().getCity()+" : "+p.getAddress().getZipcode());




	}
}