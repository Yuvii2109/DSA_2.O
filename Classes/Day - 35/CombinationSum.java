/*
    Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

    The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

    The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.    

    Example 1 -
        Input - candidates = [2,3,6,7], target = 7
        Output - [[2,2,3],[7]]
        Explanation -
            2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
            7 is a candidate, and 7 = 7.
            These are the only two combinations.

    Example 2 -
        Input - candidates = [2,3,5], target = 8
        Output - [[2,2,2,2],[2,3,3],[3,5]]

    Example 3 -
        Input - candidates = [2], target = 1
        Output - []
    
    Constraints -
        1 <= candidates.length <= 30
        2 <= candidates[i] <= 40
        All elements of candidates are distinct.
        1 <= target <= 40
*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        findCombinations(candidates, target, 0, currentCombination, result);
        return result;
    }
    private void findCombinations(int[] candidates, int target, int startIndex, List<Integer> currentCombination, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        if(target < 0){
            return; // Backtrack
        }
        for(int i = startIndex; i < candidates.length; i++){
            currentCombination.add(candidates[i]);
            findCombinations(candidates, target - candidates[i], i, currentCombination, result);
            // Unchoose - Remove the candidate we just added. This is the key step that allows us to explore other branches. For example, after exploring the path [2, 2, ...], we backtrack to [2] and then explore the path [2, 3, ...].
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}