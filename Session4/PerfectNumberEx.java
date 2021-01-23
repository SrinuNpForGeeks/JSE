public class PerfectNumberEx
{
	public static void main(String args[])
	{

		int i = 1;
		int sum = 0;
		int n = 6;

		while(i < n)
		{
			if( n % i == 0)
				{
					sum = sum + i; 
				}

				i++;

		}
      if( sum == n)
      {
      	System.out.println(n + " is a Perfect Number ");
      }else
      {
      	System.out.println(n + " is not a Perfect Number ");
      }

	}
}


/*
		6 => divisible factors are 1, 2 ,3 => sum of (1,2,3) becomes 6 so 6 is a perfect number.

		4 => 1,2 : sum(1,2) is 3 so 4 is not a perfect number

		28 => 1,2,4,7,14 sum is 28 so 28 is Perfect number.

*/
		

/*
Execution : 
							initializing i = 1 ; n = 6

							When i = 1  => while ( 1 < 6) => true => if( 6%1 == 0) => true =>   then sum = 0 + 1 = 1 : At the end of Step1 sum = 1
						    When i = 2  => while ( 2 < 6) => true => if( 6%2 == 0) => true => if( 6 % 2 == 0) then sum = 1 + 2 =3 :
						    When i = 3 if( 6 % 3 == 0) then sum = 3 + 3 = 6 : 
						    when i = 4  if( 6%4 == 0) condition fails so no update sum ; sum = 6
						    when i = 5  if( 6%5 == 0) condition fails so no update sum ; sum = 6
						    when i = 6  while (6 < 6) while loop condition fails so comes out of the loop



*/

