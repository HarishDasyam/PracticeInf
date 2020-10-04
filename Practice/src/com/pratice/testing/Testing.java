package com.pratice.testing;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("\nJava Version: "+System.getProperty("java.version"));
		    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
		    System.out.println("Java Home: "+System.getProperty("java.home"));
		    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
		    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
		    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");

	}
	public static int add(int num1, int num2) {
		int total= num1+num2;
		return total;
	}
	
	public static int divide(int num1, int num2) {
		int total=0;
		try{
			total= num1/num2;
			System.out.println("Divide method:" +total);
		}catch (Exception e) {
			
			System.out.println(e);
		}finally {
			System.out.println("Finally Block Executed");
		}
		return total;
	}
}
