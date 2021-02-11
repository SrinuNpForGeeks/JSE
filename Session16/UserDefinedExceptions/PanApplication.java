package com.google.app;
import com.google.user.UserEligibility;
import com.google.exp.AgeLimitException;


public class PanApplication
{
	public static void main(String args[])
	{

		UserEligibility user = new UserEligibility();

		try
		{
		int age = Integer.valueOf(args[0]);
		user.applyPancard(age);
		}catch(AgeLimitException exp)
		{
			System.out.println(exp.getMessage());
		}catch(ArrayIndexOutOfBoundsException exp)
		{
			System.out.println(" Please pass age as Command Line Argumet");
		}
		catch(NumberFormatException exp)
		{
			System.out.println(" Age must be integer");
		}


	}
}
