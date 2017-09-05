package com.dinner3000.leetcode.test;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.dinner3000.leetcode.solutions.LetterCombinations;

public class LetterCombinationsTest extends BaseTest {

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
	private LetterCombinations problem;
	
	@Test
	public void testSolution1() {
		List<String> result = null;
		
		result = problem.solution1("23");
		Assert.assertEquals("[ad, bd, cd, ae, be, ce, af, bf, cf]", result.toString());
		
		result = problem.solution1("");
		Assert.assertEquals("[]", result.toString());
	}

}
