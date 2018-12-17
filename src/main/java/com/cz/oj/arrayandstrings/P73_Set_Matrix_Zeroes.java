package com.cz.oj.arrayandstrings;

public class P73_Set_Matrix_Zeroes {
	public void setZeroes(int[][] matrix) {
		if(matrix == null || matrix.length == 0) return;
		boolean topZero = false;
		boolean leftZero = false;
		int rowNum = matrix.length;
		int colNum = matrix[0].length;
		// Check if left column is all zero
        for (int i = 0; i < rowNum; i++) {
        	if (matrix[i][0] == 0) {
        		leftZero = true;
        		break;
        	}
        }
        // Check if top row is all zero
        for (int i = 0; i < colNum; i++) {
        	if (matrix[0][i] == 0) {
        		topZero = true;
        		break;
        	}
        }
        // Set zeros if left column or top row is zero 
        if (rowNum > 1 && colNum > 1) {
        	for (int row = 1; row < rowNum; row++) {
        		for (int col = 1; col < colNum; col++) {
        			if (matrix[row][col] == 0) {
        				matrix[row][0] = 0;
        				matrix[0][col] = 0;
        			}
        		}
        	}
        }
        //  Set elements to zero
        for (int i = 1; i < rowNum; i++) {
        	if (matrix[i][0] == 0) {
        		for (int j = 1; j < colNum; j++) {
        			matrix[i][j] = 0;
        		}
        	}
        }
        
        for (int i = 1; i < colNum; i++) {
        	if (matrix[0][i] == 0) {
        		for (int j = 1; j < rowNum; j++) {
        			matrix[j][i] = 0;
        		}
        	}
        }
        //  Set elements to zero if top row is 
        if (topZero) {
        	for (int i = 0; i < colNum; i++) {
        		matrix[0][i] = 0;
        	}
        }
        //  Set elements to zero if left column is 
        if (leftZero) {
        	for (int i = 0; i < rowNum; i++) {
        		matrix[i][0] = 0;
        	}
        }
    }
}
