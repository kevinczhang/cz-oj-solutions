package com.oj.linkedList;

import com.oj.common.ListNode;

public class P206_Reverse_Linked_List {
	// Recursive solution
	public ListNode reverseListRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode resHead = reverseListRecursively(head.next);
        ListNode cur = resHead;
        while (cur.next != null) {
            cur = cur.next;
        }
        head.next = null;
        cur.next = head;
        return resHead;
    }
	
	// Iterative solution
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        
        while (head.next != null) {
            ListNode oldHead = dummyHead.next;
            ListNode nextNode = head.next;
            dummyHead.next = nextNode;
            head.next = nextNode.next;
            nextNode.next = oldHead;            
        }
        
        return dummyHead.next;
    }
}
