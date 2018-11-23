package com.oj.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oj.common.ListNode;

public class P234_Palindrome_Linked_ListTest {

	@Test
	public void testFalse() {
		P234_Palindrome_Linked_List solutionToTest = 
				new P234_Palindrome_Linked_List();
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		boolean res = solutionToTest.isPalindrome(head);
		assertFalse(res);
	}
	
	@Test
	public void testTrue() {
		P234_Palindrome_Linked_List solutionToTest = 
				new P234_Palindrome_Linked_List();
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		boolean res = solutionToTest.isPalindrome(head);
		assertTrue(res);
	}

}
