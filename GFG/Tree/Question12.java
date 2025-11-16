/*
    Given a Binary Search Tree(BST) and a target. Check whether there's a pair of Nodes in the BST with value summing up to the target. 

    Examples -
        Input - root = [7, 3, 8, 2, 4, N, 9], target = 12
        Output - True
        Explanation - In the binary tree above, there are two nodes (8 and 4) that add up to 12.

        Input - root = [9, 5, 10, 2, 6, N, 12], target = 23
        Output - False
        Explanation - In the binary tree above, there are no such two nodes exists that add up to 23.

    Constraints -
        1 ≤ Number of Nodes ≤ 105
        1 ≤ target ≤ 106
*/

import java.util.HashSet;

public class Question12 {
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
    private boolean dfs(Node node, HashSet<Integer> set, int target){
        if(node == null) return false;
        if(set.contains(target - node.data)) return true;
        set.add(node.data);
        return dfs(node.left, set, target) || dfs(node.right, set, target);
    }
    @SuppressWarnings("unused")
    boolean findTarget(Node root, int target) {
        // Write your code here
        HashSet<Integer> set = new HashSet<>();
        return dfs(root, set, target);
    }
}