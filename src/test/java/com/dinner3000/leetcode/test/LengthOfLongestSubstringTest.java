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

import com.dinner3000.leetcode.solutions.LengthOfLongestSubstring;

public class LengthOfLongestSubstringTest extends BaseTest{

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
	private LengthOfLongestSubstring problem;
	
	@Test
	public void testSolution1() {
		int result = 0;

		result = problem.solution1("abcabcbb");
		Assert.assertEquals(3, result);

		result = problem.solution1("bbbbb");
		Assert.assertEquals(1, result);

		result = problem.solution1("pwwkew");
		Assert.assertEquals(3, result);
	}

	@Test
	public void testSolution2() {
		int result = 0;

		result = problem.solution2("abcabcbb");
		Assert.assertEquals(3, result);

		result = problem.solution2("bbbbb");
		Assert.assertEquals(1, result);

		result = problem.solution2("pwwkew");
		Assert.assertEquals(3, result);
		
		result = problem.solution2("abba");
		Assert.assertEquals(2, result);
	}

}
