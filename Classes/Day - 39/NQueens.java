/*
    The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

    Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

    Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

    Example 1 -
        Input - n = 4
        Output - [
            [".Q..","...Q","Q...","..Q."],
            ["..Q.","Q...","...Q",".Q.."]
        ]
        Explanation - There exist two distinct solutions to the 4-queens puzzle as shown above

    Example 2 -
        Input - n = 1
        Output - [["Q"]]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    static int count = 0;
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> sol = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        nQueens(board, 0, sol);
        return sol;
    }
    public static void nQueens(char[][] board, int row, List<List<String>> sol){
        if(row == board.length){
            sol.add(constructSol(board));
            count++;
            return;
        }
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1, sol);
                board[row][j] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        // Checking vertically
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Checking diagonally left
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // Checking diagonally right
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static List<String> constructSol(char[][] board){
        List<String> sol = new ArrayList<>();
        for(char[] row : board){
            sol.add(new String(row));
        }
        return sol;
    }
}