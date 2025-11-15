/*
    Given the root of a binary tree, convert the binary tree to its Mirror tree. Note - Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

    Examples -
        Input - root = [1, 2, 3, N, N, 4]
        Output - [1, 3, 2, N, 4]
        Explanation - In the inverted tree, every non-leaf node has its left and right child interchanged.

        Input - root = [1, 2, 3, 4, 5]
        Output - [1, 3, 2, N, N, 5, 4]
        Explanation - In the inverted tree, every non-leaf node has its left and right child interchanged.

    Constraints -
        1 ≤ number of nodes ≤ 104
        1 ≤ node->data ≤ 105
*/

public class Question04 {
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
    @SuppressWarnings("unused")
    void mirror(Node root) {
        // code here
        if(root == null) return;
        mirror(root.left);
        mirror(root.right);
        
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}