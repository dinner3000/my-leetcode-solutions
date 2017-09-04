package com.dinner3000.leetcode.solutions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyAtoi {

	private Logger log = LoggerFactory.getLogger(getClass());

	public int solution1(String str) {

		int result = 0;

		do {
			String buf = str.trim();
			if (buf.length() < 1) break;
			
			int offset = 0;
			int sign = 1;
			if (buf.charAt(0) == '+') {
				offset++;
			}
			if (buf.charAt(0) == '-') {
				sign = -1;
				offset++;
			}
			if(buf.length() > 1 && (buf.charAt(1) == '+' || buf.charAt(1) == '-')) break;
			
			int val = 0;
			int j = 0;
			for (int i = buf.length() - 1; i >= offset; i--) {
				val = (int) buf.charAt(i);
				if (val < 48 || val > 57) {
					result = 0;
					j = 0;
					continue;
				}
				result += (val - 48) * Math.pow(10, j) * sign;
				j++;
			}

		} while (false);

		return result;
	}

}
