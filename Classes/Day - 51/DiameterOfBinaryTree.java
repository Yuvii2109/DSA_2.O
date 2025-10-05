/*
    Given the root of a binary tree, return the length of the diameter of the tree.

    The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

    The length of a path between two nodes is represented by the number of edges between them.

    Example 1 -
        Input - root = [1,2,3,4,5]
        Output - 3
        Explanation - 3 is the length of the path [4,2,1,3] or [5,2,1,3].

    Example 2 -
        Input - root = [1,2]
        Output - 1
    
    Constraints -
        The number of nodes in the tree is in the range [1, 104].
        -100 <= Node.val <= 100
*/

public class DiameterOfBinaryTree {
    public class TreeNode {
        @SuppressWarnings("unused")
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
        @SuppressWarnings("unused")
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int diameter;
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight); // Update the diameter at each node
        return 1 + Math.max(leftHeight, rightHeight); // Return the height of the tree
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }
    public static void main(String args[]){
        DiameterOfBinaryTree obj = new DiameterOfBinaryTree();
        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);
        System.out.println("Diameter of the binary tree is - " + obj.diameterOfBinaryTree(root));
    }
}