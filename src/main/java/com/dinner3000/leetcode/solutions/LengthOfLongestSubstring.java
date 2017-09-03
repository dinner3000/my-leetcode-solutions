package com.dinner3000.leetcode.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
	
	public int solution2(String s) {
		int result = 0;

		if (s.length() > 0) {
			Map<Character, Integer> map = new HashMap<>();
			int i = 0, j = 0;
			while (j < s.length()) {
				if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)) + 1, i);
				}
                result = Math.max(result, j - i + 1);
                map.put(s.charAt(j), j);
                j++;
			}
		}
		return result;
	}
}
