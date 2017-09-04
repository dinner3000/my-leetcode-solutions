package com.dinner3000.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dinner3000.leetcode.solutions.MyAtoi;

public class MyAtoiTest extends BaseTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private MyAtoi problem;
	
	@Test
	public void testSolution1() {
		int result = 0;
		
		result = problem.solution1("");
		Assert.assertEquals(0, result);
		
		result = problem.solution1("+123");
		Assert.assertEquals(123, result);
		
		result = problem.solution1("123");
		Assert.assertEquals(123, result);
		
		result = problem.solution1("-78");
		Assert.assertEquals(-78, result);
		
		result = problem.solution1("+-78");
		Assert.assertEquals(0, result);
		
		result = problem.solution1("  -0012a42");
		Assert.assertEquals(-12, result);
		
		result = problem.solution1("1");
		Assert.assertEquals(1, result);
		
		result = problem.solution1("-2147483648");
		Assert.assertEquals(-2147483648, result);
	}

}
