// Second Largest -
// Given an array of positive integers arr[], return the second largest 
// element from the array. If the second largest element doesn't exist 
// then return -1. Note - The second largest element should not be equal 
// to the largest element.

import java.util.Arrays;

public class Question1 {
    public int getSecondLargest(int[] arr) {
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
}