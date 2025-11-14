/*
    Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

    Input Format - The input consists of a single string s.
    Constraints - 
        1 ≤ len(s) ≤ 16
        s consists of lowercase English letters only.
    Output Format - Return a 2D list containing all possible palindrome partitioning, where each list represents a partition, and each string in the list is a palindrome. Note - Complete the given funtion only do not modify anything inside the main function
    Sample Input - aab
    Sample Output - [["a", "a", "b"], ["aa", "b"]]
    Explanation - The possible palindromic partitions are -
        ["a", "a", "b"]
        ["aa", "b"]
*/

import java.util.*;

public class Question11 {
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(String s, int start, List<String> currentList, List<List<String>> result) {
        if (start >= s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                currentList.add(s.substring(start, end + 1));
                backtrack(s, end + 1, currentList, result);
                currentList.remove(currentList.size() - 1);
            }
        }
    }
    private static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            
            List<List<String>> ans = partition(s);
            
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print("[");
                for (int j = 0; j < ans.get(i).size(); j++) {
                    System.out.print("\"" + ans.get(i).get(j) + "\"");
                    if (j != ans.get(i).size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("]");
                if (i != ans.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
        }
    }
}