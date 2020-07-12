package assignment2;

import java.util.Scanner;

public class SavingsAccount30 {
	private double balance;
	private int interestRate;
	private int accountNo;
	public SavingsAccount30(double balance, int interestRate, int accountNo) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountNo = accountNo;
	}
	public void withDraw(double amount)
	{
		if(amount>balance)
			System.out.println("Sorry ! your balance "+ balance+ " rs/- is lower than your expected withdrawl amount "+amount+"rs/-");
		else
		{
			System.out.println("successfully withdrawn " +amount+" rs/-");
			balance-=amount;
		}
	}
	public void calculateInterest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time in years till which you want to calculate interest :");
		int t= sc.nextInt();
		System.out.println("The total interest made after "+t+" years is "+(balance*t*interestRate)/100+"rs/-");
		sc.close();
	}
	public static void main(String[] args) {
		SavingsAccount30 s= new SavingsAccount30(10000, 2, 8401);
		s.calculateInterest();
		s.withDraw(2000);
		
	}
}
