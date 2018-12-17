package com.cz.oj.arrayandstrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class P73_Set_Matrix_ZeroesTest {

	@Test
	public void testSetZeroes() {
		P73_Set_Matrix_Zeroes solutionToTest = new P73_Set_Matrix_Zeroes();
		int[][] matrix = {
				{1,1,1},
				{1,0,1},
				{1,1,1}
		};
		int[][] expected = {
				{1,0,1},
				{0,0,0},
				{1,0,1}
		};
		solutionToTest.setZeroes(matrix);
		assertArrayEquals(matrix, expected);
	}

}
