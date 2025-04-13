// Next Permutation -
// Given an array of integers arr[] representing a permutation, implement 
// the next permutation that rearranges the numbers into the 
// lexicographically next greater permutation. If no such permutation 
// exists, rearrange the numbers into the lowest possible order (i.e., 
// sorted in ascending order). 
// Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

public class Question05 {
    void nextPermutation(int[] arr) {
        int k = -1;
        int n = arr.length;
        for(int i = n-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                k = i;
                break;
            }
        }
        // k identifies the pivot point till which the order keeps increasing from right to left. If the k remains -1, it means that the array is in decreasing order(i.e, the highest permutation)
        if(k == -1){
            reverse(arr, 0, n-1);
            return;
        }
        // Toh agar yeh case aa jaata hai jisme it's the highest permutation toh hum uss part ko reverse kardenge
        int largest = -1;
        for(int i = n-1; i > k; i--){
            if(arr[i] > arr[k]){
                largest = i;
                break;
            }
        }
        swap(arr, k, largest);
        reverse(arr, k+1, n-1);
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(int arr[], int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}