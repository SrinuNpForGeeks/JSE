package com.google.app;

public class FinallyBlock
{
	public static void main(String args[])
	{
		
		try
		{
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[1]);
			int c = a/b;
			System.out.println(" C : => "+c);
			
		}
		catch(ArithmeticException exp)
		{
			System.out.println(" From Catch Block: ArithmeticException 2nd Command line argument must be >0 ");
		}catch(NumberFormatException exp)
		{
			System.out.println(" Both the arguments must be Interger values");
		}catch(ArrayIndexOutOfBoundsException exp)
		{
			System.out.println("Please pass two command line arguments");
		}catch(Exception exp)
		{
			System.out.println(" Internal Server Error !!! Please try after sometime "+exp);
		}finally
		{
			System.out.println(" From FinallyBlock :: Resource Deallocation is completed");
		}
		

		

	}
}