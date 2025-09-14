public class BuildingTreePreorder {
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
    static int idx = -1;
    public static TreeNode buildTree(int nodes[]) {
        idx++;
        if(nodes[idx] == -1){
            return null;
        }
        TreeNode newNode = new TreeNode(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    public static void preorder(TreeNode root) {
        if(root == null){
            // System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNode root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static int CountNode(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftCount = CountNode(root.left);
        int rightCount = CountNode(root.right);
        return leftCount + rightCount + 1;
    }
    public static int sumNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);
        return leftSum + rightSum + root.data;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        TreeNode root = buildTree(nodes);
        System.out.println("\nPreorder traversal of the constructed tree -");
        preorder(root);
        System.out.println();
        System.out.println("\nInorder traversal of the constructed tree -");
        inorder(root);
        System.out.println();
        System.out.println("\nPostorder traversal of the constructed tree -");
        postOrder(root);
        System.out.println();
        System.out.println("\nCount of nodes in the tree - " + CountNode(root) + "\n");
        System.out.println();
        System.out.println("Sum of all nodes in the tree - " + sumNodes(root) + "\n");
    }
}