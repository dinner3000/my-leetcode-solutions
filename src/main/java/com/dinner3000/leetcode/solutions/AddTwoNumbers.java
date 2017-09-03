package com.dinner3000.leetcode.solutions;

import org.springframework.stereotype.Service;

@Service
public class AddTwoNumbers {

	public class ListNode {
		public int val;
		public ListNode next;

		public ListNode(int x) {
			val = x;
		}
	}

	public ListNode CreateList(int... digits){
		ListNode h = null, p1 = null, p2 = null;
		for(int i = 0; i < digits.length; i++){
			p1 = new ListNode(digits[i]);
			if(h == null) h = p1;
			if(p2 != null){
				p2.next = p1;
			}
			p2 = p1;
		}
		return h;
	}
	
	public ListNode solution1(ListNode l1, ListNode l2) {

		ListNode r = null, p1 = null, p2 = null;
		int sum = 0, carry = 0;
		while (carry > 0 || l1 != null || l2 != null) {

			sum = carry;
			if (l1 != null)
				sum += l1.val;
			if (l2 != null)
				sum += l2.val;
			carry = sum / 10;
			sum %= 10;
			p1 = new ListNode(sum);

			if (p2 == null) {
				p2 = p1;
			} else {
				p2.next = p1;
				p2 = p1;
			}

			if (r == null)
				r = p1;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
		}

		return r;
	}

}
