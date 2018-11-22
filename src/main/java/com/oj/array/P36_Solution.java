package com.oj.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P36_Solution {
	public boolean isValidSudoku(char[][] board) {		
		// Map to hold coordinations for chars
        Map<Character, List<Integer>> charMap = new HashMap<>();        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] == '.'){
                    continue;
                }
                List<Integer> coors = new ArrayList<>();
                if (charMap.containsKey(board[row][col])) {
                	coors = charMap.get(board[row][col]);
                    if (!validInBoard(coors, row, col)) {
                        return false;
                    }                    
                }
                coors.add(row);
                coors.add(col);
                charMap.put(board[row][col], coors);
            }
        }
        return true;
    }
	
	private boolean validInBoard(List<Integer> coors, int row, int col) {
        for (int i = 0; i < coors.size(); i+=2) {
            if (coors.get(i) == row || coors.get(i + 1) == col) {
                return false;
            }
            
            int dx = coors.get(i) / 3;
            int dy = coors.get(i + 1 ) / 3;
            for (int j = dx * 3; j < dx * 3 +3; j++) {
                for (int k = dy * 3; k < dy * 3 + 3; k++) {
                    if (j == row && k == col) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
