public class LastWaleKoCorrectPositionParLaana {
    public static void order(int arr[]){
        int i = arr.length - 1;
        while(i > 0 && arr[i] < arr[i-1]){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
            i--;
        }
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void orderTwo(int arr[], int i, int temp){
        while(i >= 0 && arr[i] > temp){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = temp;
        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 6, 7, 8, 5};
        int n = arr.length;
        System.out.print("Bubble Sort Logic - ");
        order(arr);
        System.out.print("\nInsertion Sort Logic - ");
        orderTwo(arr, n-2, arr[n-1]);
    }
}