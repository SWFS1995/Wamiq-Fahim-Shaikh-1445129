
public class BankAccount 
{
	public String Customer_name, Account_type;
	public int balance;
	
	public int deposit(int Dep_Amnt)
	{
		balance = balance +Dep_Amnt;
		return balance;
	}
	public int Withdraw(int Wth_Amnt)
	{
		balance = balance +Wth_Amnt;
		return balance;
	}
}

