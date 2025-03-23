public class MaxMinOfGivenArrays {
    public static int largestInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int max(int[] arr1, int[] arr2, int[] arr3){
        int max1 = largestInArray(arr1);
        int max2 = largestInArray(arr2);
        int max3 = largestInArray(arr3);
        return Math.max(Math.max(max1, max2), max3);
    }
    public static int smallestInArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int min(int[] arr1, int[] arr2, int[] arr3){
        int min1 = smallestInArray(arr1);
        int min2 = smallestInArray(arr2);
        int min3 = smallestInArray(arr3);
        return Math.min(Math.min(min1, min2), min3);
    }
    public static void main(String args[]){
        int[] arr1 = {3, 4, 5, 12};
        int[] arr2 = {1, 3, 4, 5, 6, 7};
        int[] arr3 = {10, 8, 6, 7, 9};
        System.out.println("Maximum of 3 arrays - " + max(arr1, arr2, arr3));
        System.out.println("Minimum of 3 arrays - " + min(arr1, arr2, arr3));
    }
}

// Misunderstood the question