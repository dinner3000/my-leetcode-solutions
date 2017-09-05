package com.dinner3000.leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LetterCombinations {
	
	public List<String> solution1(String digits) {
		List<String> result = new LinkedList<>();
		
		String[] keyMap = new String[]
				{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		if(digits.length() > 0) result.add("");
		for(int i = 0; i < digits.length(); i++){
			int idx = (int)(digits.charAt(i) - '0');
			List<String> buf = new LinkedList<>();
			for(int j = 0; j < keyMap[idx].length(); j++){
				for(int k = 0; k < result.size(); k++){
					buf.add(result.get(k) + keyMap[idx].charAt(j));
				}
			}
			result = buf;	
		}
		
		return result;
	}

}
