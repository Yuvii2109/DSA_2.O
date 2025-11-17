/*
    Given the root of a binary tree, determine if it is height-balanced or not. Note - A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.
    
    Examples -    
        Input - root = [10, 20, 30, 40, 60]
        Output - true 
        Explanation - The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.

        Input - root = [1, 2, 3, 4, N, N, N, 5]   
        Output - false
        Explanation - The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.
    
    Constraints -
        1 ≤ number of nodes ≤ 1000
        1 ≤ node->data ≤ 104
*/

public class Question15 {
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
    private int checkHeight(Node root){
        if(root == null) return 0;
        
        int leftHeight = checkHeight(root.left);
        if(leftHeight == -1) return -1;
        
        int rightHeight = checkHeight(root.right);
        if(rightHeight == -1) return -1;
        
        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }
}