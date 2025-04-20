public class Subarray {
    public static void printSubarray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                if(j < arr.length-1){
                    System.out.print(", ");
                }else{
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printSubarray(arr);
    }
}