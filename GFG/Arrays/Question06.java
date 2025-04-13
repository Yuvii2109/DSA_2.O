// You are given an array of integer arr[] where each number represents a 
// vote to a candidate. Return the candidates that have votes greater than 
// one-third of the total votes, If there's not a majority vote, return an 
// empty array. Note - The answer should be returned in an increasing format.

// Examples - 
// Input - arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
// Output - [5, 6]
// Explanation - 5 and 6 occur more n/3 times.

// Input - arr[] = [1, 2, 3, 4, 5]
// Output - []
// Explanation - 0 candidate occur more than n/3 times.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question06 {
    public List<Integer> findMajority(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > nums.length/3){
                result.add(key);
            }
        }
        return result;
    }
}