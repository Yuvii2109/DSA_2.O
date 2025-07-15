/*
    You are given a sorted array of unique integers that has been rotated at some pivot unknown to you beforehand. You are also given a target value. Your task is to find the index of the target in this rotated array. If the target does not exist, return -1.

    Input Format - The first line contains an integer n — the size of the array. The second line contains n space-separated integers, representing the rotated sorted array. The third line contains an integer target — the value to search for.

    Constraints - 
        1 ≤ n ≤ 105
        -109 ≤ array[i], target ≤ 109
        All integers in the array are unique.
    Output Format - Output a single integer - the index of the target in the array. If the target is not found, return -1.
    Sample Input - 
        7 
        4 5 6 7 0 1 2
        0
    Sample Output - 4
    Explanation - The array is [4, 5, 6, 7, 0, 1, 2]. The target 0 is at index 4.
*/

import java.util.Scanner;

public class Question17 {
    public static int binarySearch(int arr[], int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[start] <= arr[mid]){
            if(arr[start] <= target && target <= arr[mid]){
                return binarySearch(arr, target, start, mid - 1);
            }else{
                return binarySearch(arr, target, mid + 1, end);
            }
        }else{
            if(arr[mid] <= target && target <= arr[end]){
                return binarySearch(arr, target, mid + 1, end);
            }else{
                return binarySearch(arr, target, start, mid - 1);
            }
        }
    }
    public static int search(int[] arr, int target){
        int n = arr.length - 1;
        int index = binarySearch(arr, target, 0, n);
        return index;
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int index = search(arr, target);
            System.out.print(index);
        }
    }
}