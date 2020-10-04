package com.basic.java;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class LBJunit
{
	@Before
	public void beforeTest()
	{
		System.out.println("Before each test");
	}
	@Test
	public void test()
	{
		System.out.println("Lord Balaji");
	}
	@Test
	public void test1()
	{
		System.out.println("Test 1");
	}
	@After
	public void afterTest()
	{
		System.out.println("After each test");
	}
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This executes only once per before class");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This executes only once after class");
	}
}