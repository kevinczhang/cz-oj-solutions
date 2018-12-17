package com.cz.oj.arrayandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class P3_Longest_Substring_Without_Repeating_CharactersTest {

	@Test
	public void testLengthOfLongestSubstring() {
		P3_Longest_Substring_Without_Repeating_Characters solutionToTest =
				new P3_Longest_Substring_Without_Repeating_Characters();
		String s = "anviaj";
		int res = solutionToTest.lengthOfLongestSubstring(s );
		assertEquals(res, 5);
	}

}
