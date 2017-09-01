package com.dinner3000.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dinner3000.leetcode.solutions.TwoSum;

public class TwoSumTest extends BaseTest {

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

	@Autowired
	private TwoSum twoSum;

	@Test
	public void testTwoSum() {
		int[] nums = new int[] {2,3,5};
		int sum = 5;
		
		int[] result = twoSum.run(nums, sum);
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.length);
		Assert.assertTrue(result[0] < nums.length);
		Assert.assertTrue(result[1] < nums.length);
		Assert.assertEquals(sum, nums[result[0]] + nums[result[1]]);
	}

}
