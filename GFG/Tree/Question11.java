/*
    Given the root of a BST and an integer k, the task is to find the kth smallest element in the BST. If there is no kth smallest element present then return -1.
    
    Examples -
        Input - root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], k = 3
        Output - 10
        Explanation - 10 is the 3rd smallest element in the BST.

        Input - root = [2, 1, 3], k = 5
        Output - -1
        Explanation - There is no 5th smallest element in the BST as the size of BST is 3.

    Constraints -
        1 ≤ number of nodes, k ≤ 104
        1 ≤ node->data ≤ 104
*/

public class Question11 {
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
    private int kthSmallestHelper(Node node, int[] count, int k){
        // Inorder Traversal Implementation
        if(node == null) return -1;
        int left = kthSmallestHelper(node.left, count, k);
        if(left != -1){
            return left;
        }
        count[0]++;
        if(count[0] == k) return node.data;
        int right = kthSmallestHelper(node.right, count, k);
        return right;
        
    }
    public int kthSmallest(Node root, int k) {
        // code here
        int[] count = {0};
        return kthSmallestHelper(root, count, k);
    }
}