public class SumOfArray {
    public static int arraySum1(int[] arr){
        if(arr == null || arr.length == 0) return 0;
        int smallArray[] = new int[arr.length - 1];
        for(int i = 1; i < arr.length; i++){
            smallArray[i - 1] = arr[i];
        }
        int smallProblem = arraySum1(smallArray);
        int bigProblem = arr[0] + smallProblem;
        return bigProblem;
    }
    public static int arraySum2(int[] arr, int index){
        if(index == 0){
            return arr[index];
        }
        int smallProblem = arraySum2(arr, index - 1);
        int bigProblem = arr[index] + smallProblem;
        return bigProblem;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        // int index = arr.length - 1;
        int result = arraySum1(arr);
        System.out.println("Sum of array is - " + result);
    }
}