package com.oj.linkedList;

import com.oj.common.ListNode;

public class P234_Palindrome_Linked_List {
	public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode slowNode = dummyHead;
        ListNode fastNode = dummyHead;
        
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        
        slowNode.next = reverseList(slowNode.next);
        
        ListNode firstHalf = dummyHead.next;
        ListNode secondHalf = slowNode.next;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    
    private ListNode reverseList(ListNode head) {
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
