package com.basic.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class ClassB extends ClassA
{
	ClassB()
	{
		System.out.println("Constructor ClassB");
	}
	public void methodA(int i, float f)
	{
	System.out.println("MethodA Overridden"+(i+f));	
	}
	int b;
	public void methodB(int b) 
	{
		this.b=b;
		System.out.println("This is B:"+b);
	}
	public static void main(String hd[])
	{
		ClassA a = new ClassB();
		a.methodA(10);
		System.out.println("LB");
		//a.methodB(100); throws error as MethodB is not defined inside ClassA
		ClassB b = new ClassB();
		b.methodA(100);
		b.methodB(1000);
		//a.staticMethod();The static method staticMethod() from the type ClassA should be accessed in a static way
		ClassA.staticMethod(0);
		//ClassA.methodA(10000);Cannot make a static reference to the non-static method methodA(int) from the type ClassA
		new ClassA().methodA(10000);
		new ClassA();
		ClassA.a =100000;
		System.out.println(a);
		System.out.println(b);
		a.methodA(99.99f);
		b.methodA(100,1000);
		ClassA c =new ClassA();
		ClassA d= new ClassA();
		d=c;
		c.methodA(1000);
		d.methodA(10000);
		System.out.println("C"+c+" +D"+d);
		int num[]= {10,100,1000};
		new ClassB().normalArrayMethod(num);
		int var[]= {7,77,777};
		new ClassB().varArgsMethod(1, var);
		System.out.println("Variable");
		b.enumMethod(Designation.CEO);
		System.out.println("ENUM");
		LocalDate date = LocalDate.now();
		System.out.println(""+date+" "+date.minusDays(1)+" "+date.plusDays(1));
		LocalTime time = LocalTime.now();
		System.out.println(time+" "+time.minusHours(3)+" "+time.plusMinutes(10));LocalDateTime ldt = LocalDateTime.now();System.out.println(" "+ldt);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(" "+zdt);
	}
}