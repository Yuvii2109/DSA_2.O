// Code to push all the zeroes of an array to the end of the array 
// maintaining the order the same as before.

import java.util.LinkedList;
import java.util.Queue;

public class Question2 {
    public static int[] pushZerosToEnd(int[] arr) {
        // code here
        int nums[] = new int[arr.length];
        @SuppressWarnings({ "unchecked", "rawtypes" })
        Queue<Integer> q = new LinkedList();
        int count = 0;
        for(int a : arr){
            if(a != 0){
                q.offer(a);
            }else{
                count++;
            }
        }
        int i = 0;
        while(!q.isEmpty()){
            nums[i] = q.poll();
            i++;
        }
        while(count > 0){
            nums[i] = 0;
            i++;
            count--;
        }
        return nums;
    }
    // Isme 2 problems hain - 
    // 1. Hume return type void chahiye and 
    // 2. Hume queue ko bnane ki zaroort nahi hai as it leads to linear space complexity.
    // Verdict - Not a good approach... Plus Queues ki jagah sirf ek doosra array bhi use krte toh bhi ho jaata
    public static void pushZeros(int arr[]){
        int i = 0, j = 0;     
        while(j < arr.length){
            if(arr[j] == 0){
                j++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
    // Best Approach - Most Optimal - O(n) Time complexity with a constant space complexity.
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZeros(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}