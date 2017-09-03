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

import com.dinner3000.leetcode.solutions.AddTwoNumbers;

public class AddTwoNumbersTest extends BaseTest{

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
	private AddTwoNumbers problem;
	
	@Test
	public void testSolution1() {
		AddTwoNumbers.ListNode l1 = problem.CreateList(2,4,3);
		AddTwoNumbers.ListNode l2 = problem.CreateList(5,6,4);
		
		AddTwoNumbers.ListNode r = problem.solution1(l1, l2);
		
		Assert.assertEquals(7, r.val);
		Assert.assertNotNull(r.next);
		Assert.assertEquals(0, r.next.val);
		Assert.assertNotNull(r.next.next);
		Assert.assertEquals(8, r.next.next.val);
	}

}
