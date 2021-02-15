class A
{
	
	public void getData()
		{
		System.out.println(" From Parent class A : getData() ");
		}
}


class B extends A
{
	
	public void getInfo()
		{
		System.out.println(" From Child class B : getInfo() ");
		}
}



public class SingleLevelInheritanceEx
{
	public static void main(String args[])
	{

		B obj = new B();
		obj.getData();
		obj.getInfo();

	}
}

