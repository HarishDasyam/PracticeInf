package com.basic.java;
public class ClassA 
{
	class InnerClass
	{
	public void innerMethod()
	{
		System.out.println("Inner");
	}
	}
	ClassA()
	{	InnerClass ii = new InnerClass();
		ii.innerMethod();
		System.out.println("Constructor ClassA");f=10000;
	}
	static int a;float m;
	public static void staticMethod(int a)
	{
		System.out.println("Static Method"+a);
	}
	final float f;
	final public void methodA(int a) 
	{
		ClassA.a=a;
		System.out.println("This is A:"+a);
	}
	final public void methodA(float m)
	{
		this.m=m;
		System.out.println("MethodAOverloaded :"+(m+f));
	}
	static
	{
		System.out.println("statics part");
	}
	static void methodNoCall()
	{
		System.out.println("No one called");
	}
	public void normalArrayMethod(int a[])
	{
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
			System.out.println("Sum is: "+sum);
		}
	}
	public void varArgsMethod(int a, int...varArgsValue)
	{
		int sum=0;
		for(int i=0; i<varArgsValue.length;i++)
		{
			sum=sum+varArgsValue[i];
			System.out.println("Sum is: "+sum);
		}	
	}
	enum Designation
	{
		CEO(10), RM(100), ae(1);
		int empl;
		Designation(int i)
		{
			empl=i;
		}
		int empl()
		{
			return empl;
		}
	}
	enum Week
	{
		Sunday(1),Monday(2),Tuesday(3),Wednesday(4),Thursday(5),Friday(6),Saturday(7);
		int week;
		Week(int i)
		{
		week=i;	
		}
		int weekMethod()
		{
			return week;
		}
	}
	public void enumMethod(Designation designation)
	{
		switch(designation)
		{
		case CEO: 	System.out.println("CEO");
					break;
		case RM: 	System.out.println("RM");
					break;
		case ae:	System.out.println("ae");
					break;
		default: 	System.out.println("Other");
		}
		System.out.println("Emp"+designation.empl());
		for(Week w:Week.values())
		{
		System.out.println("Value "+w.name()+" "+w.weekMethod());
		}
	}
}