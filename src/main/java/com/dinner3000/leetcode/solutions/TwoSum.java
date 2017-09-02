package com.dinner3000.leetcode.solutions;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TwoSum {

    public int[] resolve(int[] nums, int target) {
    	return method2(nums, target);
    }
    
    //N2 - beats 1%
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
    
    //2N - beats 54%
    protected int[] method2(int[] nums, int target){
    	int[] result = null;
    	
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < nums.length; i++){
    		map.put(nums[i], i);
    	}
    	
    	int diff = 0;
    	int idx = 0;
    	for(int i = 0; i < nums.length; i++){
    		diff = target - nums[i];
    		if (map.containsKey(diff)){
    			idx = map.get(diff);
    			if (idx != i){
    				result = new int[]{i, idx};
    				break;
    			}
    		}
    	}
    	return result;
    }
}
