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

import com.dinner3000.leetcode.solutions.LongestPalindrome;

public class LongestPalindromeTest extends BaseTest {

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
	private LongestPalindrome problem;
	
	@Test
	public void testSolution1() {
		String result = null;
		
		result = problem.solution1("babad");
		Assert.assertEquals("bab", result);
		
		result = problem.solution1("cbbd");
		Assert.assertEquals("bb", result);
		
		result = problem.solution1("a");
		Assert.assertEquals("a", result);
	}

}
