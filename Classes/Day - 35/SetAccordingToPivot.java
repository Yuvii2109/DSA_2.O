public class SetAccordingToPivot {
    public static void pivotPartition(int[] arr, int k){
        int i = 0; 
        int j = 0;
        while(j < arr.length){
            if(arr[j] > k){
                j++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
        }
        for(int y = 0; y < arr.length; y++){
            System.out.print(arr[y] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3, 10, 15, 3, 6, 7, 8};
        int pivot = 6;
        pivotPartition(arr, pivot);
    }
}