/*
    You are given a 2-D array and you have to print the elements of upper triangle as it is and zero in the lower triangle.

    Input Format - First line of the input contains single integers n denoting number of rows and number of columns. Take next n*n elements as input of the matrix.
    Constraints - 0 < n <= 100 -10000 <= arr[i] <= 10000
    Output Format - The upper half of array with digits and lower as 0.
    Sample Input - 
        3
        1 2 3
        4 5 6
        7 8 9
    Sample Output - 
        1 2 3
        0 5 6
        0 0 9
*/

import java.util.Scanner;

public class Question16 {
    public static void printUpperTriangle(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i <= j){
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            printUpperTriangle(arr);
        }
    }
}