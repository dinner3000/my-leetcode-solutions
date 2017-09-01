package com.dinner3000.leetcode.solutions;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TwoSum {

	private Logger log = LoggerFactory.getLogger(getClass());
	
    public int[] run(int[] nums, int target) {
    	int[] result = new int[2];
    	
    	log.debug("nums: {}", Arrays.toString(nums));
    	log.debug("target: {}", target);
    	
    	log.debug("result: {}", Arrays.toString(result));
        return result;
    }
}
