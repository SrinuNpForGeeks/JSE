public class ReverseNumberForEx
{
	public static void main(String args[])
	{

		 

		int rev = 0;

		for( int n = 123; n > 0 ;n = n /10)
		{
			int r = n % 10;
			rev = rev * 10 +r;
			
		}

		System.out.println(" Reverse is ::  "+rev);
	}
}

