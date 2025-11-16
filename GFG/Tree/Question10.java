/*
    Given the root of a binary tree. Check whether it is a BST or not. A BST is defined as follows -
        The left subtree of a node contains only nodes with data less than the node's data.
        The right subtree of a node contains only nodes with data greater than the node's data.
        Both the left and right subtrees must also be binary search trees.
        Note - We are considering that BSTs can not contain duplicate Nodes.

    Examples -
        Input - root = [2, 1, 3, N, N, N, 5]
        Output - true 
        Explanation - The left subtree of every node contains smaller data and right subtree of every node contains greater data. Hence, the tree is a BST.

        Input - root = [2, N, 7, N, 6, N, 9] 
        Output - false 
        Explanation - Since the node to the right of node with data 7 has lesser value 6, hence it is not a valid BST.

        Input - root = [10, 5, 20, N, N, 9, 25]
        Output - false
        Explanation - The node with data 9 present in the right subtree has lesser key value than root node 10.

    Constraints -
        1 ≤ number of nodes ≤ 105
        1 ≤ node->data ≤ 109
*/

public class Question10 {
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
    public boolean isBST(Node root) {
        // code here
        return isBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean isBSTHelper(Node node, long minAllowed, long maxAllowed){
        if(node == null) return true;
        int val = node.data;
        if(val <= minAllowed || val >= maxAllowed){
            return false;
        }
        return isBSTHelper(node.left, minAllowed, val) && isBSTHelper(node.right, val, maxAllowed);
    }
}