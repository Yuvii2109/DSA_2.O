/*
    Given an n x m matrix, where every row and column is sorted in increasing order, and a number x . Find if element x is present in the matrix or not.

    Input Format - First line consists of two space separated integers N and M, denoting the number of element in a row and column respectively. Second line of each test case consists of N*M space separated integers denoting the elements in the matrix in row major order. Third line of each test case contains a single integer x, the element to be searched.
    Constraints - 1 <= N,M <= 30 0 <= A[i] <= 100
    Output Format - Print 1 if the element is present in the matrix, else 0.
    Sample Input - 
        3 3
        3 30 38
        44 52 54
        57 60 69
        62
    Sample Output - 0
    Explanation - Search the element in the sorted matrix. If the element is present print 1 otherwise print 0. In the sample input,in first case 62 is not present in the matrix so 0 is printed. Similarly, for second case 55 is present in the matrix so 1 is printed.
*/

import java.util.Scanner;

public class Question04 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();
            int result = searchMatrix(arr, target);
            System.out.println(result);
        }
    }
    public static int searchMatrix(int[][] matrix, int target) {
        // Write your code here
        /*
            int lowRow = 0, highRow = matrix.length - 1;
            while(lowRow <= highRow){
                int midRow = lowRow + ((highRow - lowRow) / 2);
                if(matrix[midRow][0] <= target && matrix[midRow][matrix[0].length - 1] >= target){
                    int lowCol = 0, highCol = matrix[0].length - 1;
                    while(lowCol <= highCol){
                        int midCol = lowCol + ((highCol - lowCol) / 2);
                        if(matrix[midRow][midCol] == target){
                            return 1;
                        }else if(matrix[midRow][midCol] < target){
                            lowCol = midCol + 1;
                        }else{
                            highCol = midCol - 1;
                        }
                    }
                    return 0;
                }else if(matrix[midRow][0] > target){
                    highRow = midRow - 1;
                }else{
                    lowRow = midRow + 1;
                }
            }
            return 0;

            This  implementation of “search in a 2D matrix” is actually correct under the assumption that -
                - Every row is sorted left → right, and
                - The first element of each row is greater than the last element of the previous row
        */
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0){
            if(matrix[row][col] == target){
                return 1;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return 0;
    }
}