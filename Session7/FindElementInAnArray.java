class Sample
{

	public int findElement(int[] arr,int key)
		{
			int i = 0;
			int n = arr.length;

			while( i < n)
			{
				if(key == arr[i])
				{
					return i;
			
				}

					i++;
			}

			return -1;

		}
}


public class FindElementInAnArray
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		
		int[] arr = {1,2,3,4,5,7,8,9,11,14,69,90};

		int index = s.findElement(arr,100);
		System.out.println(" index : "+index);
	}
}


// Time complexity : O(n)