package com.dinner3000.leetcode.test;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private TwoSum twoSum;

	@Test
	public void testTwoSum() {
		int[] nums = new int[] { -1, -2, -3, -4, -5 };
		int sum = -8;

		log.info("nums: {}", Arrays.toString(nums));
		log.info("target: {}", sum);
		int[] result = twoSum.resolve(nums, sum);
		log.info("result: {}", Arrays.toString(result));

		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.length);
		Assert.assertTrue(result[0] < nums.length);
		Assert.assertTrue(result[1] < nums.length);
		Assert.assertEquals(sum, nums[result[0]] + nums[result[1]]);
	}

}
