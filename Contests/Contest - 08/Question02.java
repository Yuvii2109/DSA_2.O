import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    Given a BST, you have to modify it so that value at each node is equal to sum of values of nodes in original BST which are greater than or equal to the original value of current node.

    Input Format - Single line containing Preorder input for BST. -1 represents node doesn't exist.
    Constraints - 
        1 <= No. of nodes <= 100
        0 <= Node value <= 100
    Output Format - Print Preorder traversal of the modified BST.
    Sample Input - 8 3 -1 -1 35 -1 52 -1 92 72 67 -1 -1 -1 97 -1 -1 
    Sample Output - 423 426 415 380 189 261 328 97 
*/

public class Question02 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            this.val = x;
        }
    }

    // Reconstruct tree from preorder with -1 as null marker.
    // We keep an index pointer in an array so recursive calls share it.
    public static TreeNode buildTree(List<Integer> values, int[] idx) {
        if (idx[0] >= values.size()) return null;
        int v = values.get(idx[0]++);
        if (v == -1) return null;
        TreeNode node = new TreeNode(v);
        node.left = buildTree(values, idx);
        node.right = buildTree(values, idx);
        return node;
    }

    public static void insertIntoBST(TreeNode root, int val) {
        if(val < root.val){
            if(root.left == null){
                root.left = new TreeNode(val);
            }else{
                insertIntoBST(root.left, val);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(val);
            }else{
                insertIntoBST(root.right, val);
            }
        }
    }

    public static void modifyBST(TreeNode root, int[] sum) {
        if(root == null){
            return;
        }
        // Traverse right subtree first (reverse in-order)
        modifyBST(root.right, sum);
        // Update cumulative sum and node value
        sum[0] += root.val;
        root.val = sum[0];
        // Traverse left subtree
        modifyBST(root.left, sum);
    }

    public static void preorderTraversal(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        List<Integer> values;
        try(Scanner sc = new Scanner(System.in)){
            values = new ArrayList<>();
            while (sc.hasNextInt()) {
                values.add(sc.nextInt());
            }
        }
        // Use an index pointer to rebuild the tree from preorder with -1 markers
        int[] idx = new int[]{0};
        TreeNode root = buildTree(values, idx);

        int[] sum = new int[1]; // Array to hold the cumulative sum
        modifyBST(root, sum);
        preorderTraversal(root);
    }
}