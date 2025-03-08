import java.util.*;

public class SummationOfAbsolutes {
    // Brute Force Approach - O(n^2)
    public static int subtraction(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                result += Math.abs(arr[i] - arr[j]);
            }
        }
        return result;
    }
    // Optimal Appraoch - O(nlogn)
    public static int subtractionOptimal(int[] arr){
        Arrays.sort(arr);
        int result = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            result += ((n-i-1)*arr[n-i-1] - (n-i-1)*arr[i]);
        }
        return result;
    }

    // Brute Force Approach - O(n^2)
    public static int addition(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                result += (arr[i] + arr[j]);
            }
        }
        return result;
    }
    // Optimal Approach - O(n)
    public static int optimalAdd(int[] arr){
        int result = 0;
        for(int a : arr){
            result += a; 
        }
        return (2*arr.length*result);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 7};
        System.out.println(subtractionOptimal(arr));
        System.out.println(optimalAdd(arr));
    }
}