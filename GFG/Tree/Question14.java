/*
    Given the root of a binary tree, check whether it is symmetric, i.e., whether the tree is a mirror image of itself. Note - A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.

    Examples -
        Input - root = [10, 5, 5, 2, N, N, 2] 
        Output - True
        Explanation - As the left and right half of the above tree is mirror image, the tree is symmetric.

        Input - root = [8, 4, 4, N, 6, N, 6]    
        Output - False
        Explanation -  As the left and right half of the above tree is not the mirror image, the tree is not symmetric. 

    Constraints -
        0 ≤ number of nodes ≤ 2000
        1 ≤ node->data ≤ 100
*/

public class Question14 {
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
    private boolean isMirror(Node leftSubtree, Node rightSubtree){
        if(leftSubtree == null && rightSubtree == null) return true;
        if(leftSubtree == null || rightSubtree == null || leftSubtree.data != rightSubtree.data){
            return false;
        }
        return isMirror(leftSubtree.left, rightSubtree.right) && isMirror(leftSubtree.right, rightSubtree.left);
        
    }
    public boolean isSymmetric(Node root) {
        // code here
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }
}