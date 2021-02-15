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



class C extends B
{
	
	public void print()
		{
		System.out.println(" From Grand Child class c : print() ");
		}
}


public class MultiLevelInheritanceEx
{
	public static void main(String args[])
	{

		C obj = new C();
		obj.getData();
		obj.getInfo();
		obj.print();

	}
}

