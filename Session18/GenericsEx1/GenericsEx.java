package com.google.ex;

class Sample<T>
{

	public void printData(T data)
	{
		System.out.println(data);
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

public class GenericsEx
{
	public static void main(String args[])
	{

		Sample<Integer> s = new Sample<Integer>();
		s.printData(10);

		Sample<Employee> s2 = new Sample<Employee>();
		Employee emp = new Employee();
		s2.printData(emp);
	}
}