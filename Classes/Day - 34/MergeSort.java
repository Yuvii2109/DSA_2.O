public class MergeSort {
    public static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;
        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] <= right[rightIndex]){
                merged[mergedIndex++] = left[leftIndex++];
            }else{
                merged[mergedIndex++] = right[rightIndex++];
            }
        }
        while(leftIndex < left.length){
            merged[mergedIndex++] = left[leftIndex++];
        }
        while(rightIndex < right.length){
            merged[mergedIndex++] = right[rightIndex++];
        }
        return merged;
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < arr.length; i++){
            right[i - mid] = arr[i];
        }
        return merge(mergeSort(left), mergeSort(right));
    }
    public static void main(String args[]){
        int[] arr = {5, 2, 8, 1, 9, 3, 7, 6, 4};
        int[] sortedArr = mergeSort(arr);
        for(int i = 0; i < sortedArr.length; i++){
            System.out.print(sortedArr[i] + " ");
        }
    }
}