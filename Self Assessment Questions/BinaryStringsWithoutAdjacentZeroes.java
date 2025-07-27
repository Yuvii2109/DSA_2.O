/*
    You are given a positive integer n.

    A binary string x is valid if all substrings of x of length 2 contain at least one "1".

    Return all valid strings with length n, in any order.

    Example 1 -
        Input - n = 3
        Output - ["010","011","101","110","111"]
        Explanation - The valid strings of length 3 are: "010", "011", "101", "110", and "111".

    Example 2 -
        Input - n = 1
        Output - ["0","1"]
        Explanation - The valid strings of length 1 are: "0" and "1".
*/

import java.util.ArrayList;
import java.util.List;

public class BinaryStringsWithoutAdjacentZeroes {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(new StringBuilder(), result, n);
        return result;
    }

    private void backtrack(StringBuilder sb, List<String> result, int n) {
        // Base case
        if(sb.length() == n){
            result.add(sb.toString());
            return;
        }

        // Always safe to add '1'
        sb.append('1');
        backtrack(sb, result, n);
        sb.deleteCharAt(sb.length() - 1);

        // Add '0' only if the previous char is not '0'
        if(sb.length() == 0 || sb.charAt(sb.length() - 1) != '0'){
            sb.append('0');
            backtrack(sb, result, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}