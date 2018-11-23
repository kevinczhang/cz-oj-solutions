package com.oj.linkedList;

import com.oj.common.ListNode;

public class P19_Remove_Nth_Node_From_End_of_List {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fastNode = head;
        ListNode slowNode = new ListNode(-1);
        slowNode.next = head;
        
        // Fast node move n position
        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }
        
        // Move fast node to tail
        while (fastNode != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        
        // If to be removed is head
        if (slowNode.next == head) {
            return slowNode.next.next;
        }
        
        slowNode.next = slowNode.next.next;
        
        return head;
    }
}
