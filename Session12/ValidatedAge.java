
public class ValidatedAge
{

public static void main(String args[])  
{

 	if(args.length == 0)
 	{
 		System.out.println(" \n Please Pass Age as Command Line Argument ");
 	}
 	else
 	{
 		String age = args[0];  // "19"

 		int a = Integer.valueOf(age); // int a = 19

 		if( a > 18)
 		{
 			System.out.println(" You are Eligible for Vote");
 		}else
 		{
 			System.out.println(" You are not Eligible for Vote");
 		}


 	}
		
}

}


