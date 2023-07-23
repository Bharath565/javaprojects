package bank_atm;

import java.util.Scanner;

public class ATM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		boolean bo = false;
		while(bo==false)
		{
			System.out.println("========================================================");
			System.out.println("*****Welcome to ATM*****");
			System.out.println("press 1 to deposit the money");
			System.out.println("press 2 to withdraw money");
			System.out.println("press 3 to check balance");
			System.out.println("press 4 to exit");
			System.out.println("========================================================");
			System.out.println();
			System.out.print("enter your choice : ");
			int choice = sc.nextInt();
			System.out.println();
			System.out.println("=========================================================");
			switch (choice) 
			{
				case 1:
				{
					System.out.print("please enter the deposit amount : ");
					double deposit_amount = sc.nextDouble();
					b.deposit(deposit_amount);
				}break;
				case 2 :
				{
					System.out.print("please enter withdraw amount : ");
					double withdraw_amount = sc.nextDouble();
					b.withdraw(withdraw_amount);
				} break;
				case 3 :
				{
					System.out.println("current balance : "+b.checkbalance());
				}break;
				case 4 :
				{
					bo=true;
				} break;
			default:
				System.err.println("please enter valid choice....");
				break;
			}
		}
		sc.close();
		System.out.println();
		System.out.println("*****Thank you for using my services*****");
		
	}

}
