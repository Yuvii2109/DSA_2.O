/*
    Take as input N, the size of an array. Take N more inputs and store that in an array. Take another number’s input as M. Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. Print the value returned.
        1. It reads a number N.
        2. Take Another N numbers as an input and store them in an Array.
        Take another number M as an input.
        3. If M is found in the Array the index of M is returned else -1 is returned and print the value returned.

    Input Format - Constraints - N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000. M can be between -1000000000 to 1000000000.
    Output Format - 
        Sample Input - 
            5
            2
            4
            6
            9
            17
            17
        Sample Output - 4
    Explanation - Given array = {2, 4, 6, 9, 17}. Target number = 17. Index = 4.
*/

import java.util.Scanner;

public class Question04 {
    public static void linearSearch(int arr[], int k){
        int n = arr.length;
        int index = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                index = i;
                break;
            }
        }
        System.out.print(k + " found at index - " + index);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter array length - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            linearSearch(arr, k);
        }
    }
}