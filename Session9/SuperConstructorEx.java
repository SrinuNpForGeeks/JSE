class Parent
{
	 int count ;


	public Parent(int count)
	{
		this.count = count ;
	}

}


class Child extends Parent
{

	int count ;

	public Child()
	{
		 super(5);
		 count = 15;
		
		
	}
	public void printData()
	{
		System.out.println(" Child Count : "+count); // jvm adds this.count
		System.out.println(" Parent Count : "+super.count); 
		
	}
}



public class SuperConstructorEx
{
	public static void main(String args[])
	{

		Child c = new Child();
		c.printData();

	}
}

