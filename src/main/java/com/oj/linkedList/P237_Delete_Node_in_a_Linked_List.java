package com.oj.linkedList;

import com.oj.common.ListNode;

public class P237_Delete_Node_in_a_Linked_List {
	public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
