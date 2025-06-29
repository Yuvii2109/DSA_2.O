public class Sort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int arr[], int index){
        int n = arr.length;
        if(index == n - 1){
            return;
        }
        sort(arr, index + 1);
        for(int j = index; j < arr.length - 1; j++){
            if(arr[j] > arr[j + 1]){
                swap(arr, j, j + 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 6, 2, 1, 3};
        sort(arr, 0);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}