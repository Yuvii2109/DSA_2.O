public class ReverseAnArray {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[], int i, int j){
        if(i == j || i > j){
            return;
        }
        swap(arr, i, j);
        reverse(arr, i + 1, j - 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        reverse(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}