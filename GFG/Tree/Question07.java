/*
    Given a root of a Binary Tree, return its boundary traversal in the following order -
        Left Boundary - Nodes from the root to the leftmost non-leaf node, preferring the left child over the right and excluding leaves.
        Leaf Nodes - All leaf nodes from left to right, covering every leaf in the tree.
        Reverse Right Boundary - Nodes from the root to the rightmost non-leaf node, preferring the right child over the left, excluding leaves, and added in reverse order.
        Note - The root is included once, leaves are added separately to avoid repetition, and the right boundary follows traversal preference not the path from the rightmost leaf.

    Examples -
        Input - root = [1, 2, 3, 4, 5, 6, 7, N, N, 8, 9, N, N, N, N]
        Output - [1, 2, 4, 8, 9, 6, 7, 3]

        Input - root = [1, N, 2, N, 3, N, 4, N, N] 
        Output - [1, 4, 3, 2]
        Explanation -
            Left boundary - [1] (as there is no left subtree)
            Leaf nodes - [4]
            Right boundary - [3, 2] (in reverse order)
            Final traversal - [1, 4, 3, 2]
    Constraints -
        1 ≤ number of nodes ≤ 105
        1 ≤ node->data ≤ 105
*/

import java.util.ArrayList;

public class Question07 {
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
    @SuppressWarnings("unused")
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;
        // To avoid duplicacies, first we add non leaves and then the leaves
        if(!isLeaf(root)) result.add(root.data);
        
        addLeftBoundary(root.left, result);
        
        addLeaves(root, result);
        
        addRightBoundary(root.right, result);
        
        return result;
    }
    
    private boolean isLeaf(Node root){
        return (root != null && root.left == null && root.right == null);
    }
    
    private void addLeftBoundary(Node node, ArrayList<Integer> res){
        Node current = node;
        while(current != null){
            if(!isLeaf(current)) res.add(current.data);
            if(current.left != null) current = current.left;
            else current = current.right;
        }
    }
    
    private void addLeaves(Node node, ArrayList<Integer> res){
        if(node == null) return;
        if(isLeaf(node)){
            res.add(node.data);
            return;
        }
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }
    
    private void addRightBoundary(Node node, ArrayList<Integer> res){
        ArrayList<Integer> temp = new ArrayList<>();
        Node current = node;
        while(current != null){
            if(!isLeaf(current)) temp.add(current.data);
            if(current.right != null) current = current.right;
            else current = current.left;
        }
        for(int i = temp.size() - 1; i >= 0; i--){
            res.add(temp.get(i));
        }
    }
}