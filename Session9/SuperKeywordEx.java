class Parent
{
	 int count ;


	public Parent()
	{
		count = 10 ;
	}

}


class Child extends Parent
{

	int count ;

	public Child()
	{
		 count = 15;
	}
	public void printData()
	{
		System.out.println(" Child Count : "+count); // jvm adds this.count
		System.out.println(" Parent Count : "+super.count); 
		
	}
}



public class SuperKeywordEx
{
	public static void main(String args[])
	{

		Child c = new Child();
		c.printData();

	}
}

