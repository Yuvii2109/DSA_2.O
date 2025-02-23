// We are given a sorted array which has been indexed on the basis of 1-based indexing. We are conveyed that before searching the target in the array, the odd indexed elements can swap arbitrarily and we don't know which and how many odd indices have been swapped. While the even indices remain unchanged and constant. Write a program to print "Yes" if the target is found in the array and print "No" if target isn't found.

public class SearchInOddSwappedArray {
    public static String search(int[] arr, int target){
        int low = 0, high = (arr.length - 1) / 2;
        
        // Binary search in Even Indices -
        while (low <= high){
            int mid = low + (high - low) / 2;
            int index = 2 * mid; // 1-based even index calculation

            if (index >= arr.length) break; // Prevent out-of-bounds

            if(arr[index] == target){
                return "Yes";
            }else if(arr[index] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        // 2-pointer Linear Search in Odd Indices -
        int left = 2, right = arr.length - 1; // Search in even indices now
        while (left <= right) {
            if(arr[left] == target || arr[right] == target){
                return "Yes";
            }
            left += 2;
            right -= 2;
        }

        return "No";
    }

    public static void main(String[] args) {
        int[] arr = new int[8]; // Index 0 will be unused for 1-based indexing
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 1;
        arr[4] = 4;
        arr[5] = 7;
        arr[6] = 6;
        arr[7] = 5;

        System.out.println(search(arr, 11)); 
        System.out.println(search(arr, 5));
    }
}