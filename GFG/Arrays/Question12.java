/*
    You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

    Note - Positive number starts from 1. The array can have negative integers too.

    Examples - 
        Input - arr[] = [2, -3, 4, 1, 1, 7]
        Output - 3
        Explanation - Smallest positive missing number is 3.

        Input - arr[] = [5, 3, 2, 5, 1]
        Output - 4
        Explanation - Smallest positive missing number is 4.

        Input - arr[] = [-8, 0, -1, -4, -3]
        Output - 1
        Explanation - Smallest positive missing number is 1.
*/

public class Question12 {
    public int missingNumber(int[] arr) {
        // code here
        int n = arr.length;
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(arr[i] >= 1 && arr[i] <= n){
                visited[arr[i] - 1] = true;
            }
        }
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                return (i + 1);
            }
        }
        return (n + 1);
    }
}