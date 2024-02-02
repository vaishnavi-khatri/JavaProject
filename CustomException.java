package com.Java;

import java.util.Scanner;

class VaishnaviException extends Exception
{
	double amount;
	public VaishnaviException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance = balance+amount;
		System.out.println(" Enter withdrawal amount... ");
	}
	public void withdrawal(double amount) throws VaishnaviException 
	{
		if(amount < balance)
		{
			balance = balance-amount;
			System.out.println(" ");
		}
		else
		{
			double needs=amount - balance;
			throw new VaishnaviException(needs);
		}
	}
}
public class CustomException 

{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter withdrawal amount:2500");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		
				
		amount=sc.nextDouble();
		try
		{
			a1.withdrawal(amount);
		} 
		catch (VaishnaviException e)
		{
			System.out.println("If you enter "+e.amount+" rs more into your account then you withdrawal"+amount+ "rs");
			e.printStackTrace();
		}	
	}
}