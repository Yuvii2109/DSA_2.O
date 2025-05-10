import java.util.Arrays;

public class CheckIfPairExistWhoseSumIsTarget {
    public static boolean checkIfPairExist(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right){
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true; 
            }else if (sum < target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 6, 3, 9};
        int target = 6;
        System.out.println(checkIfPairExist(arr, target));
    }
}