class Calculate
{

		public void div()
		{
			System.out.println(" \nFrom void div() : Without ReturnType , Without Parameter");
			int a = 10;
			int b = 5;
			int c = a/b;
			System.out.println(" Div c : "+c);
		}

		public void sub(int a , int b)
		{
			System.out.println("\n From void sub(int,int) : Without ReturnType , With Parameters");
			int c = a-b;
			System.out.println(" Sub c : "+c);
		}

		public int add()
		{
			System.out.println(" \n From int add() : With ReturnType , Without Parameter");
			int a = 10;
			int b = 20;
			int c = a+b;

			return c;
		}


		public int mul(int a, int b)
		{
			
			System.out.println(" \n From int mul(int,int) : With ReturnType , With Parameters");
			int c = a * b;

			return c;
		}

		
	
}

public class CalculateApp
{
	public static void main(String args[])
	{
		Calculate c = new Calculate();
		c.div();
		c.sub(6,2);
       
		int result = c.add();
		System.out.println(" Add Result is : "+result);

		int mulResult = c.mul(2,3);
		System.out.println(" Mul is : "+mulResult);

	}
}















