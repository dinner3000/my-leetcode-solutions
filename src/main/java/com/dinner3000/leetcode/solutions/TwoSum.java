package com.dinner3000.leetcode.solutions;

import org.springframework.stereotype.Service;

@Service
public class TwoSum {

    public int[] resolve(int[] nums, int target) {
    	return method1(nums, target);
    }
    
    //O2
    protected int[] method1(int[] nums, int target){
    	int[] result = null;
    	for(int i = 0; i < nums.length; i++){
    		for(int j = 0; j < nums.length; j++){
    			if (i == j) continue;
    			if (nums[i] + nums[j] == target){
    				result = new int[]{i, j};
    				break;
    			}
    		}
            if (result != null) break;
    	}
    	return result;
    }
    
    //O2
    protected int[] method2(int[] nums, int target){
    	int[] result = null;
    	for(int i = 0; i < nums.length; i++){
    		for(int j = 0; j < nums.length; j++){
    			if (i == j) continue;
    			if (nums[i] + nums[j] == target){
    				result = new int[]{i, j};
    				break;
    			}
    		}
    	}
    	return result;
    }
}
