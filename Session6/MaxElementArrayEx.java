public class MaxElementArrayEx
{
	public static void main(String args[])
		{

		
			int[] arr = {-1,-2,-9,-5,-6,-1};

			int max = Integer.MIN_VALUE;

			System.out.println(Integer.MIN_VALUE);

			for(int i = 0 ; i < arr.length ; i++)
			{
				if( max < arr[i])
						{
							max = arr[i];
						}
			}

			System.out.println(" Max : "+max);
		}
}