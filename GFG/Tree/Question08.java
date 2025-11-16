/*
    Given the root of a binary tree, your task is to find the maximum path sum. The path may start and end at any node in the tree.
    
    Examples -    
        Input - root[] = [10, 2, 10, 20, 1, N, -25, N, N, N, N, 3, 4]
        Output - 42
        Explanation - Max path sum is represented using green colour nodes in the above binary tree.
    
        Input - root[] = [-17, 11, 4, 20, -2, 10]
        Output - 31
        Explanation - Max path sum is represented using green colour nodes in the above binary tree.
    
    Constraints -
        1 ≤ number of nodes ≤ 103
        -104 ≤ node->data ≤ 104
*/

public class Question08 {
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
    public static class Max {
        public int value;
    }
    public int findMaxSum(Node root) {
        // code here
        Max m = new Max();
        m.value = Integer.MIN_VALUE;
        findMax(root, m);
        return m.value;
    }
    public static int findMax(Node root, Max m) {
        if(root == null) return 0;
        
        int left = findMax(root.left, m);
        int right = findMax(root.right, m);
        
        int maxSingle = Math.max(root.data, Math.max(left, right) + root.data); // Current node plus one child node
        
        int maxTop = root.data + left + right; // Current node plus both subtrees
        
        m.value = Math.max(m.value, Math.max(maxSingle, maxTop));
        
        return maxSingle;
    }
}