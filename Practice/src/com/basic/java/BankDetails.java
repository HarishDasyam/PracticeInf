package com.basic.java;
import java.util.Scanner;
public class BankDetails
{
	int amount;
	float interestRate;
	double totalAmount,monthlyPayment;
	static int months[]= {1,2,3,4,5,6,7,8,9,10,11,12};
	public static void main(String hd[])
	{
	Scanner sc = new Scanner(System.in);
	BankDetails b = new BankDetails();
	System.out.println("Lord Balaji");
	System.out.println("Enter loan amount:");
	b.amount = sc.nextInt();
	System.out.println("Enter interest rate:");
	b.interestRate = sc.nextFloat();
	b.totalAmount = b.amount+(b.amount*b.interestRate/100);
	b.monthlyPayment = b.totalAmount/12;
	for(int i:months)
	{
		b.totalAmount = b.totalAmount-b.monthlyPayment;
		System.out.println("Remaining Amount after "+i+" month is :"+b.totalAmount);
	}
	sc.close();
	}
}