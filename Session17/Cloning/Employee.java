package com.google.ex;

public class Employee implements Cloneable
{

	private int empNo ;
	private String empName;
	private Float empSal;

	public Employee(){
		System.out.println(" Employee Object is created ");
	}

	public Employee(int empNo,String empName,float empSal)
	{
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}

	public void setEmpNo(int empNo)
	{
		this.empNo = empNo;
	
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	
	}

	public void setEmpSal(float empSal)
	{
		this.empSal = empSal;
	
	}

	public int getEmpNo()
	{
		return empNo;
	
	}

	public String getEmpName()
	{
		return empName;
	
	}

	public float getEmpSal()
	{
		return empSal;
	
	}

	public Employee copyObject() throws Exception
	{
		return (Employee) clone();
	}
}

/*
emp1 => 1242 , Srinu , 5000
emp2 =>

Employee emp2 = new Employee();
emp2.setEmpNo(emp1.getEmpNo())

*/










