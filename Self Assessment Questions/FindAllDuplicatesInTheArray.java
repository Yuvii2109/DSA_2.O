/*
    Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

    You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

    Example 1 -
        Input - nums = [4,3,2,7,8,2,3,1]
        Output - [2,3]

    Example 2 -
        Input - nums = [1,1,2]
        Output - [1]

    Example 3 -
        Input - nums = [1]
        Output - []
    
    Constraints -
        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n
        Each element in nums appears once or twice.
*/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInTheArray {
    public List<Integer> findDuplicates(int[] nums) {
        /*
            List<Integer> list = new ArrayList<>();
            int n = nums.length;
            int[] freqArray = new int[n + 1];
            for(int num : nums){
                freqArray[num]++;
            }
            for(int i = 0; i < n + 1; i++){
                if(freqArray[i] == 2){
                    list.add(i);
                }
            }
            return list;

            -> Code toh theek hai but O(1) space requirement meet nahi karta toh... We'd code something else...
        */
        List<Integer> result = new ArrayList<>();
        for(int num : nums){
            int index = Math.abs(num) - 1;
            if(nums[index] < 0){
                result.add(Math.abs(num));
            }else{
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}