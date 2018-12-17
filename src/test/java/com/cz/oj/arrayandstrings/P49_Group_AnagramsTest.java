package com.cz.oj.arrayandstrings;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class P49_Group_AnagramsTest {

	@Test
	public void testGroupAnagrams() {
		P49_Group_Anagrams solutionToTest = new P49_Group_Anagrams();
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res = solutionToTest.groupAnagrams(strs);
		List<List<String>> expected = new ArrayList<>();
		expected.add(Arrays.asList("ate","eat","tea"));
		expected.add(Arrays.asList("nat","tan"));
		expected.add(Arrays.asList("bat"));
		
		assertEquals(res.size(), 3);
	}

}
