public class TwoDArrayEx
{
	public static void main(String args[])
		{

		
			int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9} };

			int rows = arr.length;

			for( int i = 0 ; i < rows ; i++)
			{
				int cols = arr[i].length;

					for( int j = 0 ; j < cols ; j++)
					{
						System.out.print(arr[i][j]+"  ");
					}

					System.out.println();
			}

			
		}
}