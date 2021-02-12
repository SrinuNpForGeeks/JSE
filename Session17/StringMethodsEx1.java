package com.google.ex;

public class StringMethodsEx1
{
	public static void main(String args[])
	{

		String s1 = "Srinu";
		String s2 = s1.intern(); // returns the object from String constnat pool

		System.out.println(" s1 == s2 "+ (s1 == s2)); // true

		String s3 = String.join(" - ","Srinu","Uday","Kavya","Kalya"); // Srinu-Udy-Kavya-Kalya
		System.out.println(s3);

		String s4 = "12/Feb/2021";
		String[] strArr = s4.split("/"); // {"12","Feb","2021"}
		for(String e: strArr)
		{
			System.out.println(e);
		}


		String message = String.format(" EmpNo => %d :: EmpName =>  %s : EmpSal => %f ",1242,"Srinu",5000f);
		System.out.println(message);
	}
}