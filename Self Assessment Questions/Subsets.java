/*
    Given an integer array nums of unique elements, return all possible subsets (the power set).

    The solution set must not contain duplicate subsets. Return the solution in any order.

    Example 1 -
        Input - nums = [1,2,3]
        Output - [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

    Example 2 -
        Input - nums = [0]
        Output - [[],[0]]
*/

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        backtrack(nums, currentList, result, 0);
        return result;
    }
    private static void backtrack(int[] nums, List<Integer> currentList, List<List<Integer>> result, int index){
        if(index == nums.length){
            result.add(new ArrayList<>(currentList));
            return;
        }
        currentList.add(nums[index]);
        backtrack(nums, currentList, result, index + 1);
        currentList.remove(currentList.size() - 1);
        backtrack(nums, currentList, result, index + 1);
    }
}