/*
    Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

    Input Format - The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.
    Constraints - Length of the arrays should be between 1 and 1000.
    Output Format - Print all the pairs of numbers which sum to target. Print each pair in increasing order.
    Sample Input - 
        5
        1
        3
        4
        2
        5
        5
    Sample Output - 
        1 and 4
        2 and 3
    Explanation - Find any pair of elements in the array which has sum equal to target element and print them.
*/

import java.util.Scanner;

public class Question05 {
    public static void pairs(int[] arr, int k){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == k){
                    if(arr[i] <= arr[j]){
                        System.out.println(arr[i] + " and " + arr[j]);
                    }else{
                        System.out.println(arr[j] + " and " + arr[i]);
                    }
                }
            }
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter array length - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println("Pairs are - ");
            pairs(arr, target);
        }
    }
}