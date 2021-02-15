class Sample
{

	public int findElement(int[] arr,int key)
		{
			
			return findElement(arr,key,0,arr.length-1);
		

		}

	public int findElement(int[] arr, int key, int low , int high)
		{
			int mid = low + (high - low)/2;

			if(low > high)
					return -1;

			if(arr[mid] == key)
					return mid;

			if( key < arr[mid])
				 return findElement(arr,key,low,mid-1);

			else 
				  return findElement(arr,key,mid+1,high);

		}
}


public class FindElementInAnArrayWithBinerySearchWithRecursion
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		
		int[] arr = {1,2,3,4,5,7,8,9,11,14,69,90};

		int index = s.findElement(arr,14);
		System.out.println(" index : "+index);
	}
}


// Time complexity : O(n)