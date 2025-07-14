/*
    Take as input a 2-d array.Print the 2-D array in sprial form clockwise.

    Input Format - Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).
    Constraints - Both M and N are between 1 to 100.
    Output Format - All M * N integers separated by commas with 'END' written in the end(as shown in example).
    Sample Input - 
        4 4
        11 12 13 14
        21 22 23 24
        31 32 33 34
        41 42 43 44
    Sample Output - 11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END
    Explanation - For spiral level clockwise traversal, Go for first row-> last column ->last row -> first column and then do the same traversal for the remaining matrix .
*/

import java.util.Scanner;

public class Question05 {
    public static void spiralMatrix(int[][] arr){
        int startRow = 0, startCol = 0;
        int endRow = arr.length - 1, endCol = arr[0].length - 1;
        while(startRow <= endRow && startCol <= endCol){
            // Top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(arr[startCol][j] + ", ");
            }

            // Right 
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(arr[i][endCol] + ", ");
            }

            // Bottom 
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j] + ", ");
            }

            // Left
            for(int i = endRow - 1; i > startRow; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol] + ", ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.print("END");
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int m = sc.nextInt();
            System.out.print("Enter the number of columns - ");
            int n = sc.nextInt();
            int arr[][] = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    System.out.print("Enter the value of [" + i + "][" + j + "] - ");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Spiral Matrix - ");
            spiralMatrix(arr);
        }
    }
}