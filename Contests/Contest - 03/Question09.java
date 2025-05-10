/*
    You are given an array consisting only of the numbers 0, 1, and 2. Your task is to sort the array in ascending order without using any inbuilt sorting functions.
    Input Format - The first line contains an integer n, the size of the array. The second line contains n integers, each being 0, 1, or 2.

    Constraints - 1 <= n <= 106, nums[i] is either 0, 1, or 2.

    Output Format - Print the sorted array in a single line, where all 0s appear first, followed by 1s, and then 2s.
        Sample Input - 
            6
            0 1 2 1 0 2
        Sample Output - 0 0 1 1 2 2
        Explanation - The given array is [0, 1, 2, 1, 0, 2]. After sorting, the array becomes [0, 0, 1, 1, 2, 2]. This is achieved by rearranging the elements such that all 0s come first, followed by 1s, and then 2s.
*/

import java.util.Scanner;

public class Question09 {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort012(int arr[]){
        int start = 0, mid = 0, end = arr.length-1;
        while(mid <= end){
            if(arr[mid] == 0){
                swap(arr, start, mid);
                start++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, end);
                end--;
            }
        }
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter array length - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            sort012(arr);
            System.out.println("Sorted 0-1-2 - ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}