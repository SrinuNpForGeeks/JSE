class Sample
{

	public int findElement(int[] arr,int key)
		{
			
				int low = 0; 
				int high = arr.length - 1;
				

				while(low < high)
				{
					int mid = low + (high - low)/2;

					if(arr[mid] == key)
							return mid;

					if(key > arr[mid])
						 low = mid + 1;

					else if(key < arr[mid])
						  high = mid -1;

				}

				return -1;

		}
}


public class FindElementInAnArrayWithBinerySearch
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		
		int[] arr = {1,2,3,4,5,7,8,9,11,14,69,90};

		int index = s.findElement(arr,11);
		System.out.println(" index : "+index);
	}
}


// Time complexity : O(n)