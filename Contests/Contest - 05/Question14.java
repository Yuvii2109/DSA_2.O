/*
    Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.

    Input Format - First line contains two integers m and n denoting the dimensions of the matrix Next m lines contains n integers each.
    Constraints - 1 <= m*n <= 106
    Output Format - Print the modified matrix
    Sample Input - 
        2 2
        1 0
        0 0
    Sample Output - 
        1 1
        1 0
*/

import java.util.Scanner;

public class Question14 {
    public static void convert(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 1;
                }
            }
        }
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[][] = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            convert(arr);
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}