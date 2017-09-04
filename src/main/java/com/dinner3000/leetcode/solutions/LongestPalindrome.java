package com.dinner3000.leetcode.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LongestPalindrome {

	private Logger log = LoggerFactory.getLogger(getClass());

	public String solution1(String s) {
		int l = 0, l1 = 0, l2 = 0;
		int beg = 0, end = 0;
		for(int i = 0; i < s.length(); i++){
			l1 = expand(s, i, i);
			l2 = expand(s, i, i + 1);
			l = Math.max(l1,  l2);
			if (l > end - beg){
				beg = i - (l - 1) / 2;
				end = beg + l;
			}
		}
		return s.substring(beg, end);
	}
	
	protected int expand(String s, int l, int r){
		while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
			l--;
			r++;
		}
		return r - l - 1;
	}
}
