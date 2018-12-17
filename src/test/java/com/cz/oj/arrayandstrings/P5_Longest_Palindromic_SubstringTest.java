package com.cz.oj.arrayandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class P5_Longest_Palindromic_SubstringTest {

	@Test
	public void testLongestPalindrome() {
		P5_Longest_Palindromic_Substring solutionToTest = 
				new P5_Longest_Palindromic_Substring();
		
		String s = "babad";
		String res = solutionToTest.longestPalindrome(s);
		assertEquals(res, "bab");
	}

}
