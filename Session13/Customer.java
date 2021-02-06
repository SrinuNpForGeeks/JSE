interface ATM 
{

	public abstract float checkBalance(int pin);
	public abstract void greet();

}


abstract class ATMAbstract implements ATM
{
	public void greet()
	{
		System.out.println(" Dear Customer :: Welcome");
	}
}


class HDFCBank extends ATMAbstract
{

	public float checkBalance(int pin)
	{
		if(pin == 1111)
		{
			System.out.println(" PIN verified !!! ");
			return 4000f;
		}else
		{
			System.out.println(" Invalid PIN !!! ");
			return 0f;
		}
	}

}

class ICICIBank extends ATMAbstract
{

	public float checkBalance(int pin)
	{
		if(pin == 2222)
		{
			System.out.println(" PIN verified !!! ");
			return 5000f;
		}else
		{
			System.out.println(" Invalid PIN !!! ");
			return 0f;
		}
	}

}

class AXISBank extends ATMAbstract
{

	public float checkBalance(int pin)
	{
		if(pin == 3333)
		{
			System.out.println(" PIN verified !!! ");
			return 2000f;
		}else
		{
			System.out.println(" Invalid PIN !!! ");
			return 0f;
		}
	}

}

class SBIBank extends ATMAbstract
{

	public float checkBalance(int pin)
	{
		if(pin == 4444)
		{
			System.out.println(" PIN verified !!! ");
			return 1000f;
		}else
		{
			System.out.println(" Invalid PIN !!! ");
			return 0f;
		}
	}

}

public class Customer
{

	public static void main(String args[]) throws Exception
	{

		if(args.length != 2)
		{
			System.out.println(" Please pass the Service Provider and PIN as a command line arguments. Avialable Provicers \n HDFCBank \n AXISBank \n SBIBank \n ICICIBank");
		}else
		{
			String providerName = args[0];
			String providerPIN = args[1];

			int pin = Integer.valueOf(providerPIN);

			System.out.println(providerName+ " Card verified Successfully");

			 Class c = Class.forName(providerName);
			 ATM provider  = (ATM) c.newInstance();
			 provider.greet();
			 float balance = provider.checkBalance(pin); // Runtime Polymorphism
			 if(balance > 0)
			 {
			 	System.out.println(" Balance is :: "+balance);
			 }


		}


	}
}











