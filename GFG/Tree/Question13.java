/*
    Given the root of a Binary Search Tree (with all values unique) and two nodes n1 and n2 (n1 != n2). You may assume that both nodes exist in the tree. Find the Lowest Common Ancestor (LCA) of the given two nodes in the BST.

    Note - LCA between two nodes n1 and n2 is defined as the deepest node that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

    Examples -
        Input - root = [5, 4, 6, 3, N, N, 7, N, N, N, 8], n1->data = 7, n2->data = 8
        Output - 7
        Explanation - 7 is the lowest node that has both 7 and 8 as descendants.

        Input - root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], n1->data = 8, n2->data = 14
        Output - 8
        Explanation - 8 is the lowest node that has both 8 and 14 as descendants.

        Input - root = [2, 1, 3], n1->data = 1, n2->data = 3        
        Output - 2
        Explanation - 2 is the lowest node that has both 1 and 3 as descendants.

    Constraints -
        1 ≤ number of nodes ≤ 105
        1 ≤ node->data ≤ 105
        1 ≤ n1->data, n2->data ≤ 105
*/

public class Question13 {
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
    public Node LCA(Node root, Node n1, Node n2) {
        // code here
        if(root == null) return null;
        
        if(n1.data < root.data && n2.data < root.data){
            return LCA(root.left, n1, n2);
        }else if(n1.data > root.data && n2.data > root.data){
            return LCA(root.right, n1, n2);
        }else{
            return root;
        }
    }
}