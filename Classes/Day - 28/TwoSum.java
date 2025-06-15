import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumHash(int[] arr, int target){
        HashMap<Integer, Integer> visited  = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int difference = target - arr[i];
            if(visited.containsKey(difference)){
                return new int[]{i, visited.get(difference)};
            }
            visited.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    public static int[] twoSum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 11};
        int target = 13;
        int[] result = twoSum(arr, target);
        System.out.print("[ ");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.print("]");
    }
}