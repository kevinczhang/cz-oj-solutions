package com.oj.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oj.common.ListNode;

public class P19_Remove_Nth_Node_From_End_of_ListTest {

	@Test
	public void testRemoveHead() {
		P19_Remove_Nth_Node_From_End_of_List solutionToTest = 
				new P19_Remove_Nth_Node_From_End_of_List();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		ListNode res = solutionToTest.removeNthFromEnd(head , 2);
		assertEquals(2, res.val);
	}
	
	@Test
	public void testRemoveTail() {
		P19_Remove_Nth_Node_From_End_of_List solutionToTest = 
				new P19_Remove_Nth_Node_From_End_of_List();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		ListNode res = solutionToTest.removeNthFromEnd(head , 1);
		assertEquals(1, res.val);
	}

}
