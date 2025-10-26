
import java.util.Scanner;

/*
    Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

    According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

    Input Format - Enter the number of nodes N and add N more numbers to the BST, then add the two numbers whose LCA is to be found.
    Constraints - 
        The number of nodes in the tree is in the range [2, 105].
        -109 <= Node.val <= 109
        All Node.val are unique.
        p != q
        p and q will exist in the BST
    Output Format - Display the LCA value.
    Sample Input - 
        4
        5
        3
        2
        7
        7
        5
    Sample Output - 5
*/

public class Question09 {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if(root == null){
            return null;
        }
        if(p < root.val && q < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if (p > root.val && q > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            TreeNode root = null;
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                root = insertIntoBST(root, val);
            }
            int p = sc.nextInt();
            int q = sc.nextInt();
            TreeNode lca = lowestCommonAncestor(root, p, q);
            System.out.println(lca.val);
        }
    }
}