// Rotate Array -
// Given an array arr[]. Rotate the array to the left (counter-clockwise 
// direction) by d steps, where d is a positive integer. Do the mentioned 
// change in the array in place.
// Note - Consider the array as circular.

public class Question04{
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // Ek tareeka toh hogya ki hum bna len ek or temporary array and 
        // usme hm add karden pivot point se pehle ke saare ke saare elements
        // same order main and unn sbko primary array se delete krte rahen 
        // phir unhe primary array ke last main push karden... ab isme ek 
        // drawback hai jo ki yeh hai ki this would increase the space complexity 
        // to linear to counter this we can also adopt another method of reversal
        int n = arr.length;
        d %= n; // To manage the case in which d > n
        reverse(arr, 0, d-1); // Reverse the first d elements
        reverse(arr, d, n-1); // Reverses the remaining elements
        reverse(arr, 0, n-1); // Reverses the entire array
    }
    static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        rotateArr(arr, k);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
} 