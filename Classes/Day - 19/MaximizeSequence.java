/*
    Find any re-arrangement for arr = {2, 7, 9, 4, 2, 1, 6} for which - 
        ∑ i x arr[i] is maximized
*/

import java.util.Arrays;

public class MaximizeSequence {
    public static int maximize(int[] arr){
        Arrays.sort(arr);
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            max += arr[i] * i;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 4, 2, 1, 6};
        int max = maximize(arr);
        System.out.println("Maximum Value of Series - " + max);
    }
}