/*Practical 4.1 :  Define a base class BankAccount with common attributes like accountNumber,
accountHolderName, and balance. Then, define two subclasses: SavingAccount and
FixedDepositAccount, which inherit from BankAccount. Implement basic operations like
openAccount(), deposit(), checkBalance(), and withdraw() in BankAccount. The
SavingAccount should include a calculateInterest() method specific to savings accounts,
and FixedDepositAccount should have a maturityAmount() method considering fixed
deposit terms.*/

import java.util.*;
class BankAccount
{
	int accountNumber;
	String accountHolderName;
	float balance;
	void openAccount(String s,int an, float b)
	{
		accountHolderName = s;
		accountNumber = an;
		balance = b;
	}
	void Deposit(float amt)
	{
		balance += amt;
		return;
	}
	void checkBalance()
	{
		System.out.print("\nBalance = " + balance);
		return;	
	}
	void withdraw(float wa)
	{
		if(wa > balance)
		{
			System.out.print("\nInsufficient balance.");
		}
		else
		{
			balance -= wa;
		}
		return;
	}
}
class SavingAccount extends BankAccount
{
	void calculateInterest(double rate, int time)
	{
    		double interest;
    		interest = (balance * rate * time) / 100;
    		System.out.println("\nInterest = " + interest);
	}	
}
class FixedDepositAccount extends BankAccount
{
	void maturityAmount(double rate, int time)
	{
    		double amount;
    		amount = balance * Math.pow((1 + rate / 100), time);
    		System.out.println("\nMaturity Amount = " + amount);
	}
}
class Bank
{
	public static void main(String[] args)
	{
		System.out.println("\n\nEnrollment No.: 240410107160\nName : Shah Bhagya Pranav");

		SavingAccount sa = new SavingAccount();
		FixedDepositAccount fda = new FixedDepositAccount();

		System.out.print("\n\nSaving account : ");
		sa.openAccount("Bhagya",160,5000);
		sa.Deposit(1000);
		sa.checkBalance();
		sa.withdraw(2000);
		sa.checkBalance();
		sa.calculateInterest(1.2,1);
		
		System.out.print("\n\nFixed deposit account : ");
		fda.openAccount("Purva",167,7000);
		fda.Deposit(500);
		fda.checkBalance();
		fda.withdraw(3500);
		fda.checkBalance();
		fda.maturityAmount(11,5);
	}
}


