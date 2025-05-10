/*
    Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].

    Challenge - do this without division in linear time

    Input Format - First line contains integer N as size of array.
    Next line contains a N integer as element of array. The product of any prefix or suffix of arr is NOT guaranteed to fit in a 32-bit integer.
    Constraints - -10000000 < arr[i] <= 10000000
    Output Format - Print output array
        Sample Input - 
            4
            1 2 3 4
        Sample Output - 24 12 8 6 
*/

import java.util.Scanner;

public class Question10 {
    public static long[] productExceptSelf(int arr[]){
        if(arr == null || arr.length == 0){
            return new long[]{};
        }
        int n = arr.length;
        long result[] = new long[n];
        long leftProduct[] = new long[n];
        leftProduct[0] = 1;
        for(int i = 1; i < n; i++){
            leftProduct[i] = arr[i-1] * leftProduct[i-1];
        }
        long rightProduct = 1;
        for(int i = n-1; i >= 0; i--){
            result[i] = leftProduct[i] * rightProduct;
            rightProduct *= arr[i];
        }
        return result;
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            long result[] = productExceptSelf(arr);
            for(int i = 0; i < result.length; i++){
                System.out.print(result[i] + " ");
            }
        }
    }
}