public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int current = arr[i];
            int previous = i-1;
            while(previous >= 0 && arr[previous] > current){
                arr[previous + 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 7, 9, 5, 3, 2, 1, 10};
        insertionSort(arr);
    }    
}