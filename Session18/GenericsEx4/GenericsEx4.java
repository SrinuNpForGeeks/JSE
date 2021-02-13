package com.google.ex;

interface Employee
{

	public abstract void getInfo();
}


class RegularEmployee implements Employee
{
	public void getInfo()
	{
		System.out.println(" From RegularEmployee getInfo() ");
	}
}

class ContractEmployee implements Employee
{
	public void getInfo()
	{
		System.out.println(" From ContractEmployee getInfo() ");
	}
}


class Sample<T extends Employee>
{
	private T emp;

	public Sample(T emp)
	{
		this.emp = emp;
	}


	public  void getData()
	{
		emp.getInfo();
	}
}

public class GenericsEx4
{
	public static void main(String args[])
	{
		RegularEmployee emp1 = new RegularEmployee();

		ContractEmployee emp2 = new ContractEmployee();

		Sample<Employee> s1 = new Sample<>(emp1);

		Sample<Employee> s2 = new Sample<>(emp2);
		s1.getData();
		s2.getData();

	}
}







