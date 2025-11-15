/*
    Given the root of a binary tree, your task is to find the diameter of the binary tree.

    The diameter (also called the width) of a binary tree is defined as the number of edges on the longest path between any two leaf nodes. Note that this path may or may not pass through the root of the tree.

    Examples -
        Input - root = [1, 2, 3]
        Output - 2
        Explanation - The longest path has 2 edges (node 2 -> node 1 -> node 3).

        Input - root[] = [5, 8, 6, 3, 7, 9]
        Output - 4
        Explanation - The longest path has 4 edges (node 3 -> node 8 -> node 5 -> node 6 -> node 9).

    Constraints -
        1 ≤ number of nodes ≤ 103
        0 ≤ node->data ≤ 105
*/

public class Question03 {
    public static class Node {
        @SuppressWarnings("unused")
        int data;
        Node left, right;

        @SuppressWarnings("unused")
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    static int diameter = 0;
    public int diameter(Node root) {
        // code here
        diameter = 0;
        height(root);
        return diameter;
    }
    public int height(Node root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}