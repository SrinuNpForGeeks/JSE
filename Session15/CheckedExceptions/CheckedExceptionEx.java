package com.google.app;
import com.google.Sample;

public class CheckedExceptionEx
{
	public static void main(String args[]) 
	{
		
			
			try
			{

				Class c = Class.forName(args[0]);
	 			Sample s = (Sample)c.newInstance();
	 			  s.getInfo();

			}catch(ClassNotFoundException exp)
			{
				System.out.println(" Please pass class name including package");
			}catch(InstantiationException exp)
			{
				System.out.println(" Object creation is Failed :: The Sample class must and should have Default Cosntructor");
			}catch(IllegalAccessException exp)
			{
				System.out.println("  The Sample class Default Cosntructor must be public ");

			}

			
		
	  



	}
}

//   public static java.lang.Class<?> forName(java.lang.String) throws java.lang.ClassNotFoundException;

//   public T newInstance() throws java.lang.InstantiationException, java.lang.IllegalAccessException;
