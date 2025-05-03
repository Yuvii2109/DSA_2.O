public class FindFirstIndexOfMinimum {
    public static int findMinWithoutMAXAssumption(int[] arr){
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMinInRange(int[] arr, int l, int r){
        int minIndex = l;
        for(int i = l+1; i <= r; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        int arr[] = {-10, 5, 8, 17, -23, -23, 50};
        int result = findMinWithoutMAXAssumption(arr);
        System.out.println("Index of minimum value - " + result + ", and minimum value is " + arr[result]);
    }
}