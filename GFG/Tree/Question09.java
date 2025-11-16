/*
    Given the root of a binary tree and an integer k, determine the number of downward-only paths where the sum of the node values in the path equals k.

    Note - A path can start and end at any node within the tree but must always move downward (from parent to child).

    Examples -
        Input - root = [8, 4, 5, 3, 2, N, 2, 3, -2, N, 1], k = 7
        Output - 3
        Explanation - The following paths sum to k
    
        Input - root = [1, 2, 3], k = 3
        Output - 2 
        Explanation - The following paths sum to k

    Constraints -
        1 ≤ number of nodes ≤ 104
        -100 ≤ node value ≤ 100
        -109 ≤ k ≤ 109
*/

import java.util.HashMap;

public class Question09 {
    public static class Node {
        @SuppressWarnings("unused")
        int data;
        @SuppressWarnings("unused")
        Node left;
        @SuppressWarnings("unused")
        Node right;

        @SuppressWarnings("unused")
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    private static int countPathUtil(Node node, int k, int currentSum, HashMap<Integer, Integer> prefixSum){
        if(node == null) return 0;
        int pathCount = 0;
        currentSum += node.data;
        if(currentSum == k) pathCount++;
        pathCount += prefixSum.getOrDefault(currentSum - k, 0);
        prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);
        
        pathCount += countPathUtil(node.left, k, currentSum, prefixSum);
        pathCount += countPathUtil(node.right, k, currentSum, prefixSum);
        
        prefixSum.put(currentSum, prefixSum.get(currentSum) - 1);
        
        return pathCount;
    }
    @SuppressWarnings("unused")
    private static int countPathsFromNode(Node node, int k, int currentSum){
        if(node == null) return 0;
        int pathCount = 0;
        currentSum += node.data;
        if(currentSum == k){
            pathCount++;
        }
        pathCount += countPathsFromNode(node.left, k, currentSum);
        pathCount += countPathsFromNode(node.right, k, currentSum);
        return pathCount;
    }
    public int countAllPaths(Node root, int k) {
        /*
            if(root == null) return 0;
            int result = countPathsFromNode(root, k, 0);
            result += countAllPaths(root.left, k);
            result += countAllPaths(root.right, k);
            return result;
        */
        // code here
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        return countPathUtil(root, k, 0, prefixSum);
    }
}