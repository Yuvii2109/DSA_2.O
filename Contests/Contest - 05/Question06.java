/*
    Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.

    Input Format - First line contains a single integer N. Next N lines contain N space separated integers.
    Constraints - N < 1000
    Output Format - Print N lines with N space separated integers of the rotated array.
    Sample Input - 
        4
        1 2 3 4
        5 6 7 8
        9 10 11 12
        13 14 15 16
    Sample Output - 
        4 8 12 16 
        3 7 11 15 
        2 6 10 14 
        1 5 9 13 
    Explanation - Rotate the array 90 degrees anticlockwise.
*/

import java.util.Scanner;

public class Question06 {
    public static void transposeArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                if(i == j){
                    continue;
                }else{
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
    public static void reverseArray(int[][] arr){
        int i = 0, j = arr.length - 1;
        while(i < j){
            int temp[] = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int k = 0; k < arr.length; k++){
            for(int y = 0; y < arr[0].length; y++){
                System.out.print(arr[k][y] + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] arr){
        transposeArray(arr);
        reverseArray(arr);
    }
    public static void main(String args[]) {
        // Your Code Here
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int N = sc.nextInt();
            int arr[][] = new int[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print("Enter the element at position [" + i + "][" + j + "] - ");
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Rotated Array - ");
            rotate(arr);
        }
    }
}