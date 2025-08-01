/*
    Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n]. You may return the answer in any order.

    Example 1 -
        Input - n = 4, k = 2
        Output - [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
        Explanation - There are 4 choose 2 = 6 total combinations.
        Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.

    Example 2 -
        Input - n = 1, k = 1
        Output - [[1]]
        Explanation - There is 1 choose 1 = 1 total combination.
*/

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(int n, int k, int start, List<Integer> current, List<List<Integer>> result){
        if(current.size() == k){
            result.add(new ArrayList<>(current));
            return;
        }
        // If there aren’t enough numbers left to reach k, stop early
        int remainingNeeded = k - current.size();
        // The largest starting point we can still pick `remainingNeeded` numbers -> n - remainingNeeded + 1
        for (int i = start; i <= n - remainingNeeded + 1; i++) {
            current.add(i);
            backtrack(n, k, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
