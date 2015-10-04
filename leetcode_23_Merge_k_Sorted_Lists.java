package com.leetcode.twenty_three;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null, list = null;
		int min;
		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				min = l1.val;
				l1 = l1.next;
			} else {
				min = l2.val;
				l2 = l2.next;
			}
			if (head == null) {
				head = new ListNode(min);
				list = head;
			} else {
				list.next = new ListNode(min);
				list = list.next;
			}
		}
		if (l1 != null) {
			if (head == null)
				return l1;
			else
				list.next = l1;
		}
		if (l2 != null) {
			if (head == null)
				return l2;
			else
				list.next = l2;
		}
		return head;
	}

	ListNode[] lists;

	public ListNode mergeKLists(ListNode[] lists) {

		if (lists.length == 0)
			return null;
		if (lists.length == 1)
			return lists[0];
		this.lists = lists;
		return mergeListsRecur(0, lists.length);
	}

	private ListNode mergeListsRecur(int begin, int end) {
		// TODO Auto-generated method stub
		if (begin + 1 == end)
			return lists[begin];
		if (begin + 2 == end)
			return mergeTwoLists(lists[begin], lists[begin + 1]);
		ListNode list1 = this.mergeListsRecur(begin, (begin + end) / 2);
		ListNode list2 = this.mergeListsRecur((begin + end) / 2, end);
		return this.mergeTwoLists(list1, list2);

	}
}
