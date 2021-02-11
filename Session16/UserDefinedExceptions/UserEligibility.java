package com.google.user;
import com.google.exp.AgeLimitException;

public class UserEligibility
{
	
	public void applyPancard(int age) throws AgeLimitException
	{
			if(age < 18)
			{
					throw new AgeLimitException(" Age Must be >= 18");
			}

			System.out.println(" You are eligible for PanCard application.");
			System.out.println(" Documents Verification has to be done ?");

	}

}