package com.google.app;
import com.google.ex.Employee;

public class CloningApp
{
	
	public static void main(String args[]) throws Exception
	{

	Employee emp1 = new Employee(1242,"Srinu",5000);


	Employee emp2 = emp1.copyObject();
	emp2.setEmpName("Srinu NP");

	System.out.println(" emp1 Data :: "+emp1.getEmpNo() + " : "+emp1.getEmpName()+ " : "+emp1.getEmpSal());
	System.out.println(" emp2 Data :: "+emp2.getEmpNo() + " : "+emp2.getEmpName()+ " : "+emp2.getEmpSal());

	}
}