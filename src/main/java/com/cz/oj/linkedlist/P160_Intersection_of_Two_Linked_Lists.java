package com.cz.oj.linkedlist;

import com.cz.oj.common.ListNode;

public class P160_Intersection_of_Two_Linked_Lists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null && curB != null && curA != curB) {
            if(curB.next == null && curA.next == null){
                return null;
            }
            curA = (curA.next == null) ? headB : curA.next;
            curB = (curB.next == null) ? headA : curB.next;
        }
        if (curA == curB) {
            return curA;
        }
        return null;
    }
}
