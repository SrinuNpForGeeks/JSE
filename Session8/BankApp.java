class AccountHolder
{

	
		private long accountNo = 12345;
		private float accountBal = 1500f;

		public void withDraw(int pin, int amount)
		{
			if(pin == 1111)
				{
						accountBal = accountBal - amount;
				}
			else
			{
				System.out.println(" Invalid Pin ::");
			}
		}

		public void getAccountDetails()
		{
			System.out.println( "Account No : "+accountNo);
			System.out.println("Account Bal :"+accountBal);
		}
}


public class BankApp
{
	public static void main(String args[])
	{
		AccountHolder acc = new AccountHolder();
		acc.withDraw(1121,600);
		acc.getAccountDetails();
	}
}


// Time complexity : O(n)