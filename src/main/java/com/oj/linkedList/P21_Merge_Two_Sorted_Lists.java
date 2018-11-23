package com.oj.linkedList;

import com.oj.common.ListNode;

public class P21_Merge_Two_Sorted_Lists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 != null ? l1 : l2;
        }
        
        ListNode head = (l1.val < l2.val) ? new ListNode(l1.val) : new ListNode(l2.val);
        if(l1.val < l2.val) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        
        while (l1 != null || l2 != null) {
            if (l1 == null || l2 == null) {
                head.next = l1 != null ? l1 : l2;
                return dummyHead.next;
            }
            
            if (l1.val < l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }            
            head = head.next;
        }
        return dummyHead.next;
    }
}
