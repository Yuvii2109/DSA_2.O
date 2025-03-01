import java.util.HashMap;

public class SubArraysWithSumK {
    public static int subarrayWithSumK(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        map.put(0,1); // Key-Value pair of (sum, count)
        for(int num : nums){
            sum += num;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 3};
        System.out.println(subarrayWithSumK(nums, 3));
    }
}