package com.google.ex;

class  Sample
{
	private final int count;

	public Sample()
	{
		count = 10;
	}

	public int getCount()
	{
		return count;
	}
}

class SampleChild extends Sample
{

	private int currentCount = 15;

	public int getCount()
	{
		return currentCount;
	}
}


public class ImmutableBugWithoutMakingFinal
{
  
  public static void main(String args[])
  {
  	Sample s = new SampleChild();
  	System.out.println(" count "+s.getCount()); // count : 15 Actual value is 10 so we should always make Class as final.
  }

}

