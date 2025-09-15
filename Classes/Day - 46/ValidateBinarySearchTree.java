public class ValidateBinarySearchTree {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isValidBST(TreeNode root) {
        return validateBST(root, null, null);
    }
    private static boolean validateBST(TreeNode node, Integer min, Integer max) {
        if(node == null){
            return true;
        }
        if((min != null && node.data <= min) || (max != null && node.data >= max)){
            return false;
        }
        return validateBST(node.left, min, node.data) && validateBST(node.right, node.data, max);
    }
    public static void main(String[] args) {
        /*
                 2
                / \
               1   3
        */
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println("Is the tree a valid BST? " + isValidBST(root)); // Output - true

        /*
                 5
                / \
               1   4
                  / \
                 3   6
        */
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);

        System.out.println("Is the tree a valid BST? " + isValidBST(root2)); // Output - false
    }
}