package com.google.ex;

class Sample<T>
{

private T  data;

public Sample()
{

}

public Sample(T data)
{
	this.data = data;
}
	
public T getData()
	{
		return data;
	}
}


class Employee
{
	private Integer empNo;
	private String empName;
	private Float empSal;

	public Employee()
	{
		empNo = 111;
		empName ="Uday:";
		empSal = 5000f;
	}

	public String toString()
	{
		return empNo+ " : "+empName+ " : "+empSal;
	}
}

public class GenericsEx2
{
	public static void main(String args[])
	{


		Sample<Employee> s1 = new Sample<Employee>();
		Employee emp1 = s1.getData();
		System.out.println(" emp1 => "+emp1);



		Employee e = new Employee();

		Sample<Employee> s2 = new Sample<Employee>(e);
		Employee emp2 = s2.getData();
		System.out.println(" emp2 => "+emp2);
	}
}













