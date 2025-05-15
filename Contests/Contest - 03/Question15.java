/*
    You are very fond of finding squares of a number. You want to sort an integer array after finding squares of each number. You are given an integer array nums sorted in non-decreasing order, print an array of the squares of each number sorted in non-decreasing order.
    Input Format - 
        First Line contains an integer N (size of the array) .
        Second Line contains an integer array.
    Constraints - 
        1 <= N <= 104
        -104 <= Nums[i] <= 104
    Output Format - Print squared-sorted array.
    Sample Input - 
        5 
        -3 -2 0 1 4 
    Sample Output - 0 1 4 9 16 
    Explanation - Taking Square and then our Sorted array will look like - 0 1 4 9 16
*/

import java.util.Arrays;
import java.util.Scanner;

public class Question15 {
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        arr = sortedSquares(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}