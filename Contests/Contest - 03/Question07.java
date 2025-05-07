/*
    Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that selection sorts the array. Print the elements of sorted array.
        1. It reads a number N.
        2. Take Another N numbers as input and store them in an Array.
        3. Sort the array using Selection Sort and print that Array.
    Input Format - Constraints - N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.
    Output Format - 
        Sample Input - 
            4
            2
            -18
            45
            30
        Sample Output - 
            -18
            2
            30
            45
        Explanation - Write selection sort to sort the given integers in the problem.
*/

import java.util.Scanner;

public class Question07 {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the array length - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            selectionSort(arr);
            System.out.println("Sorted array - ");
            for(int i = 0; i < n; i++){
                System.out.println(arr[i]);
            }
        }
    }
}