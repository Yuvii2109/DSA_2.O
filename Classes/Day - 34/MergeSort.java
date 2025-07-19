public class MergeSort {
    public static void mergeIntoSorted(int[] arr1, int[] arr2){
        int i = 0, j = 0, z = 0;
        int n = arr1.length, m = arr2.length;
        int[] merged = new int[n + m];
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                merged[z] = arr1[i];
                i++;
            }else{
                merged[z] = arr2[j];
                j++;
            }
            z++;
        }
        while(i < n){
            merged[z] = arr1[i];
            i++;
            z++;
        }
        while(j < m){
            merged[z] = arr2[j];
            j++;
            z++;
        }
        for(int k = 0; k < merged.length; k++){
            System.out.print(merged[k] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 7, 8, 9, 10, 12};
        int arr2[] = {2, 5, 10, 15, 17, 18};
        mergeIntoSorted(arr1, arr2);
    }
}