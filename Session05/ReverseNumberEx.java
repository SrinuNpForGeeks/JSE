public class ReverseNumberEx
{
	public static void main(String args[])
	{

		int n = 123; 

		int rev = 0;

		while( n > 0)
		{
			int r = n % 10;
			rev = rev * 10 +r;
			n = n /10;
		}

		System.out.println(" Reverse is ::  "+rev);
	}
}


/*
 
step 1 : n = 123  , rev = 0

	while( 123 > 0)

		  r = 123 % 10 = 3

		  rev = 0 * 10 + 3 = 3

		  n = 123 / 10 = 12


	Step2 : n= 12 , rev = 3
	
		while( 12 > 0)
			{
				r = 12 % 10 = 2
				rev = 3 * 10 + 2 = 32
				n = 12/10 = 1;
			}	  


	step3 : n = 1 , rev = 32

	    while( 1 > 0)
	    	r = 1 % 10 = 1
			rev = 32 * 10 + 1 = 321
			n = 1 /10 = 0

	step 4 : n = 0 , rev = 321
	        while( 0 > 0) condition fails


print rev :


*/







