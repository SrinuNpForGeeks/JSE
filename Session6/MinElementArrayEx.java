public class MinElementArrayEx
{
	public static void main(String args[])
		{

		
			int[] arr = {-1,-2,-9,-5,-6,-1};

			int min = Integer.MAX_VALUE;


			for(int i = 0 ; i < arr.length ; i++)
			{
				if( min > arr[i])
						{
							min = arr[i];
						}
			}

			System.out.println(" Min : "+min);
		}
}