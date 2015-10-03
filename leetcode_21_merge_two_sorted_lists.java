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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1 = new ListNode(0);
		ListNode head2 = new ListNode(6);

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(56);
		ListNode n4 = new ListNode(11);
		ListNode n5 = new ListNode(14);
		ListNode n6 = new ListNode(35);
		ListNode n7 = new ListNode(109);
		ListNode n8 = new ListNode(194);
		ListNode n9 = new ListNode(233);

		head1.next = n1;
		n1.next = n2;
		n2.next = n3;
		head2.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;

		ListNode list = new Solution().mergeTwoLists(head1, head2);

		while (list != null) {
			System.out.println(list.val);
			list = list.next;
		}
		// System.out.println(new Solution().generateParenthesis(3));
	}
}
