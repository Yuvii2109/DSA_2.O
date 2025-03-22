// Second Largest -
// Given an array of positive integers arr[], return the second largest 
// element from the array. If the second largest element doesn't exist 
// then return -1. Note - The second largest element should not be equal 
// to the largest element.

import java.util.Arrays;

public class Question1 {
    // Brute Force Approach - O(nlogn)
    public static int getSecondLargest(int[] arr) {
        if(arr.length == 0 || arr.length == 1){
            return -1;
        }
        Arrays.sort(arr);
        int n = arr.length-1;
        int answer = -1;
        for(int i = n-1; i >= 0; i--){
            if(arr[i] != arr[i+1]){
                answer = arr[i];
                break;
            }else{
                continue;
            }
        }
        return answer;
    }

    // Optimal Approach - O(n)
    public static int secondLargest(int[] arr){
        int largest = -1, secondLargest = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(getSecondLargest(arr));
        System.out.println(secondLargest(arr));
    }
}