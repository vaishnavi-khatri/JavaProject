//WAP to demonstrate try catch block
package com.Java;

public class TryCatchBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			int numerator=15;
			int denominator=0;
			int result=numerator/denominator;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: Division by zero is not allowed");
		}
		finally
		{
			System.out.println("This block always executes");
		}
		System.out.println("program continue executing.....");
	}

}
