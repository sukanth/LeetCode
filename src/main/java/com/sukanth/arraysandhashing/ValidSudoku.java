package com.sukanth.arraysandhashing;

import java.util.HashSet;

/**
 * Difficulty Level : Medium
 * <p>
 * ***********************************************************************************************
 * <p>
 * Question : https://leetcode.com/problems/valid-sudoku/
 * Solution :
 * Explanation : https://www.youtube.com/watch?v=Pl7mMcBm2b8
 * <p>
 * ***********************************************************************************************
 * <p>
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * <p>
 * ***********************************************************************************************
 */
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] test = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(test));
    }

    /**
     * @param board
     * @return
     */
    private static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current_val = board[i][j];
                if (current_val != '.') {
                    if (!seen.add(current_val + " row " + i) ||
                            !seen.add(current_val + " colum " + j) ||
                            !seen.add(current_val + " box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
