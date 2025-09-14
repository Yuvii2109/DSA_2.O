public class BuildBinarySearchTreeUsingLevelOrder {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode buildBST(int[] levelOrder) {
        if(levelOrder.length == 0) return null;

        TreeNode root = new TreeNode(levelOrder[0]);
        for(int i = 1; i < levelOrder.length; i++){
            insertIntoBST(root, levelOrder[i]);
        }
        return root;
    }
    private static void insertIntoBST(TreeNode root, int value) {
        if(value < root.data){
            if(root.left == null){
                root.left = new TreeNode(value);
            }else{
                insertIntoBST(root.left, value);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(value);
            }else{
                insertIntoBST(root.right, value);
            }
        }
    }
    public static void inorderTraversal(TreeNode root) {
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int[] levelOrder = {10, 5, 15, 3, 7, 12, 18};
        TreeNode root = buildBST(levelOrder);
        System.out.println("Inorder Traversal of the constructed BST -");
        inorderTraversal(root);
    }
}