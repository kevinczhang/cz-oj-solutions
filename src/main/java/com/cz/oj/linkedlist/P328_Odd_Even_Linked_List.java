package com.cz.oj.linkedlist;

import com.cz.oj.common.ListNode;

public class P328_Odd_Even_Linked_List {
	public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;
        while(evenTail != null && evenTail.next != null) {
            ListNode nextNode = evenTail.next;
            oddTail.next = nextNode;
            evenTail.next = nextNode.next;
            nextNode.next = evenHead;
            // Update tails
            oddTail = oddTail.next;
            evenTail = evenTail.next;
        }
        return head;
    }
}
