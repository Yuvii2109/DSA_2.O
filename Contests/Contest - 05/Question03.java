/*
    Take as input a two-d array. Wave print it column-wise.

    Input Format - Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).
    Constraints - Both M and N are between 1 to 10.
    Output Format - All M * N integers seperated by commas with 'END' written in the end(as shown in example).
    Sample Input - 
        4 4
        11 12 13 14
        21 22 23 24
        31 32 33 34
        41 42 43 44
    Sample Output - 11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END
*/

import java.util.Scanner;

public class Question03 {
    public static void printZigZag(int[][] arr){
        for(int j = 0; j < arr[0].length; j++){
            if(j % 2 == 0){
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i][j] + ", ");
                }
            }else{
                for(int i = arr.length - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + ", ");
                }
            }
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
            System.out.println("Converted Array - ");
            printZigZag(arr);
        }
    }
}