/*
    Given a root of a Binary Tree, your task is to return its Inorder Traversal.

    Note - An inorder traversal first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree).

    Examples -
        Input - root = [1, 2, 3, 4, 5]        
        Output - [4, 2, 5, 1, 3]
        Explanation - The inorder traversal of the given binary tree is [4, 2, 5, 1, 3].

        Input - root = [8, 1, 5, N, 7, 10, 6, N, 10, 6]
        Output - [1, 7, 10, 8, 6, 10, 5, 6]
        Explanation - The inorder traversal of the given binary tree is [1, 7, 10, 8, 6, 10, 5, 6].

    Constraints -
        1 ≤ number of nodes ≤ 3*104
        0 ≤ node->data ≤ 105
*/

import java.util.ArrayList;

public class Question06 {
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
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        return inorderHelper(root, result);
    }
    private ArrayList<Integer> inorderHelper(Node root, ArrayList<Integer> result){
        if(root == null) return result;
        inorderHelper(root.left, result);
        result.add(root.data);
        inorderHelper(root.right, result);
        return result;
    }
}