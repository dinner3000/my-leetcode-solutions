package com.dinner3000.leetcode.solutions;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LengthOfLongestSubstring {

	private Logger log = LoggerFactory.getLogger(getClass());

	public int solution1(String s) {
		int result = 0;

		if (s.length() > 0) {
			Set<Character> set = new HashSet<>();
			int i = 0, j = 0;
			while (i < s.length() && j < s.length()) {
				if (!set.contains(s.charAt(j))) {
					set.add(s.charAt(j));
					result = Math.max(result, j - i + 1);
					j++;
				} else {
					set.remove(s.charAt(i));
					i++;
				}
			}
		}
		return result;
	}
}
