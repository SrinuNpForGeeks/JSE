public class PollyndrumEx
{
	public static void main(String args[])
	{

		int n = 323; 

		int rev = 0;

		int temp = n;

		while( n > 0)
		{
			int r = n % 10;
			rev = rev * 10 +r;
			n = n /10;
		}

		if( rev == temp)
		{
			System.out.println(" Given Number is pollydrum ");
		}else
		{
			System.out.println(" Given Number is not a pollydrum ");
		}
	}
}

