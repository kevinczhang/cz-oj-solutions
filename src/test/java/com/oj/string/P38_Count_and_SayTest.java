package com.oj.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class P38_Count_and_SayTest {

	@Test
	public void test1() {
		P38_Count_and_Say solutionToTest = new P38_Count_and_Say();
		assertEquals("1", solutionToTest.countAndSay(1));
	}
	
	@Test
	public void test2() {
		P38_Count_and_Say solutionToTest = new P38_Count_and_Say();
		assertEquals("11", solutionToTest.countAndSay(2));
	}
	
	@Test
	public void test3() {
		P38_Count_and_Say solutionToTest = new P38_Count_and_Say();
		assertEquals("21", solutionToTest.countAndSay(3));
	}

}
