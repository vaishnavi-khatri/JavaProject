package com.Java;
abstract class Parent
{
	public abstract void message();
}
class FirstSubclass extends Parent
{
	public void message()
	{
		System.out.println("This is first subclass");
	}
}
class SecondSubclass extends Parent
{
	public void message()
	{
		System.out.println("This is second subclass");
	}
}

public class Inheritance 
{
	public static void main(String[] args) 
	{
		Parent obj1=new FirstSubclass();
		Parent obj2=new SecondSubclass();
			
		obj1.message();
		obj2.message();
	}
}
