class A
{
	
	public void getData()
		{
		System.out.println(" \nFrom Parent class A : getData() ");
		}
}


class B extends A
{
	
	public void getInfo()
		{
		System.out.println(" From Child class B : getInfo() ");
		}
}



class C extends A
{
	
	public void print()
		{
		System.out.println(" From Grand Child class c : print() ");
		}
}


public class HierarichalInheritance
{
	public static void main(String args[])
	{

		C obj1 = new C();
		obj1.getData();
		obj1.print();


		B obj2 = new B();
		obj2.getData();
		obj2.getInfo();

	}
}

