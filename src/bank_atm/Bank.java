package bank_atm;

public class Bank implements Bank_Interface
{
	double balance =0;
	
	public void deposit(double deposit_Amount) 
	{
		if(deposit_Amount % 100 ==0 || deposit_Amount % 500 ==0)
					balance += deposit_Amount;
		else
			System.err.println("This ATM will accepts only multiples of 100's & 500's");
		
	}

	public void withdraw(double withdraw_amount) 
	{
		if(withdraw_amount<= balance)
		{
			if(withdraw_amount % 100 ==0 || withdraw_amount % 500 ==0)
					balance -= withdraw_amount;
		else
			System.err.println("This ATM will accepts only multiples of 100's & 500's");
		}
		else
			System.err.println("Transaction fail due to insufficient Balance...");
	}

	public double checkbalance() 
	{
		
		return balance;
	}


}
