public class QuickSort {
    public static void quickSort(int arr[], int start, int end){
        if(start == end){
            return;
        }else if(start > end){
            return;
        }
        int partPos = partition(arr, start, end);
        quickSort(arr, start, partPos - 1);
        quickSort(arr, partPos + 1, end);
    }
    public static int partition(int arr[], int start, int end){
        int n = end;
        int pivot = arr[n];
        int i = start, j = start;
        while(j < end){
            if(arr[j] > pivot){
                j++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j]; 
                arr[j] = temp;
                i++;
                j++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return i; // Return Pivot Index
    }
    public static void main(String[] args) {
        int arr[] = {3, 15, 7, 10, 1, 8};
        quickSort(arr, 0, arr.length - 1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}