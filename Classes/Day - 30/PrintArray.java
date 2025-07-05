public class PrintArray {
    public static void printArray(int arr[], int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int i = 0;
        printArray(arr, i);
    }
}