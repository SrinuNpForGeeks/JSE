
package com.google.ex11;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Employee implements Serializable
{

	private Integer empNo;
	private String empName;
	private Float emapSal;

	public Employee(Integer empNo, String empName,Float emapSal)
	{
		this.empNo = empNo;
		this.empName = empName;
		this.emapSal = emapSal;
	}

	public String toString()
	{

		return "empNo : "+empNo+" empName : "+empName+" emapSal : "+emapSal;
	}
}


public class SerializationEx
{

	public static void main(String args[]) throws Exception
	{

		OutputStream out = new FileOutputStream("Employee.txt");

		ObjectOutputStream objOut = new ObjectOutputStream(out);

		Employee emp = new Employee(1242,"Srinu",5000f);

		objOut.writeObject(emp);
		
		System.out.println(" Serialization Completed ");
	}
}