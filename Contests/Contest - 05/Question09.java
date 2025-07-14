/*
    Given a 2D array, sort each of its rows and print the result.
    Input Format - First line contains 2 integers - r & c. Next r lines contains c integers each denoting the matrix elements.
    Constraints - 1 <= R,C <= 100
    Output Format - Print the modified matrix
    Sample Input -
        4 5
        13 5 13 9 11 
        5 10 11 4 6 
        6 10 17 12 16 
        8 11 7 18 5 
    Sample Output -
        5 9 11 13 13 
        4 5 6 10 11 
        6 10 12 16 17 
        5 7 8 11 18 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Question09 {
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < n; i++){
                Arrays.sort(arr[i]);
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}