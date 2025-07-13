/*
    Take as input a two-d array. Wave print it row-wise.

    Input Format - Two integers M(row) and N(column) and further M * N integers(2-d array numbers).
    Constraints - Both M and N are between 1 to 10.
    Output Format - All M * N integers are seperated by commas with 'END' written in the end(as shown in example).
    Sample Input - 
        4 4
        11 12 13 14
        21 22 23 24
        31 32 33 34
        41 42 43 44
    Sample Output - 11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
*/

import java.util.Scanner;

public class Question01 {
    public static void printZigZag(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < arr[0].length; j++){
                    System.out.print(arr[i][j] + ", ");
                }
            }else{
                for(int j = arr[0].length - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.print("END");
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of rows - ");
            int m = sc.nextInt();
            System.out.print("Enter number of columns - ");
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