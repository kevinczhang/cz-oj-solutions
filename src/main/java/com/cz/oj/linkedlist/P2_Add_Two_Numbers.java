package com.cz.oj.linkedlist;

import com.cz.oj.common.ListNode;

public class P2_Add_Two_Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode fakeHead = new ListNode(-1);
        ListNode cur = fakeHead;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            
            if (carry > 9) {
                cur.next = new ListNode(carry % 10);
                carry = 1;
            } else {
                cur.next = new ListNode(carry);
                carry = 0;
            }
            cur = cur.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(1);
        }
        return fakeHead.next;
    }
}
