public class PrimeNumberBreakEx
{
	public static void main(String args[])
	{

		int n = 17;

		int count = 0;

		for( int i = 2 ; i <= n/2 ; i++)
		{
			if( n % i == 0)
			{
				count ++;
				break;
			}
		}

		if(count == 0)
		{
			System.out.println(" Given Number is Prime");
		}else
		{
		  System.out.println(" Given Number is Not a  Prime");
		}
	}
}



/*
   15 => 5

   20 => 10


   30 => 15

   Given number is n then max possible div factor is => n/2

*/