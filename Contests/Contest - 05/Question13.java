/*
    Given a N*N matrix. The task is to find the index of column with maximum sum. That is the column whose sum of elements are maximum.
    Input Format - First line contains the N ,size of the square matrix. Next N lines contains N integers each denoting the elements of the matrix
    Constraints - 1 <= N < 1000
    Output Format - Print two integers - the 1-based index of the column with the maximum sum and the maximum sum itself.
    Sample Input -
        7
        90 40 1 3 39 59 90 
        48 72 67 32 73 19 27 
        22 37 47 68 1 5 55 
        81 5 39 53 38 86 21 
        1 32 7 44 2 65 47 
        68 13 24 28 69 81 43 
        16 34 67 3 82 26 35 
    Sample Output - 6 341
    Explanation - 6th column has the highest sum that is 341.
*/

import java.util.Scanner;

public class Question13 {
    public static void findMaxColSum(int[][] arr){
        int sum = 0;
        int[] res = new int[arr.length];
        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length; i++){
                sum += arr[i][j];
            }
            res[j] = sum;
            sum = 0;
        }
        int max = res[0];
        int maxIndex = 0;
        for(int i = 1; i < res.length; i++){
            if(max < res[i]){
                max = res[i];
                maxIndex = i;
            }
        }
        System.out.println((maxIndex + 1) + " " + max);
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
            findMaxColSum(arr);
        }
    }
}