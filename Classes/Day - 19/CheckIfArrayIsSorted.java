public class CheckIfArrayIsSorted {
    public static boolean checkSorted(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[] = {6, 7, 5, 1, 2};
        int arr2[] = {1, 3, 10, 50, 60};
        if(checkSorted(arr1)){
            System.out.println("arr1 is sorted");
        }else{
            System.out.println("arr1 is not sorted");
        }
        if(checkSorted(arr2)){
            System.out.println("arr2 is sorted");
        }else{
            System.out.println("arr2 is not sorted");
        }
    }
}