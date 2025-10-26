import java.util.Scanner;

/*
    Given the root of a binary search tree, and an integer k, print the kth smallest value (1-indexed) of all the values of the nodes in the tree.

    Input Format - First line contains the number of nodes. Next line contains n space separated integers denoting the elements of the BST. Insert them into the BST as given in order. Third line contains a single line integer k
    Constraints - 
        The number of nodes in the tree is n.
        1 <= k <= n <= 104
        0 <= Node.val <= 104
    Output Format - Print the kth smallest value in the BST
    Sample Input - 
        6
        4 2 3 9 5 1
        3
    Sample Output - 3
*/

public class Question10 {
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
    public static int kthSmallest(TreeNode root, int k) {
        int[] count = {0};
        int[] result = { -1 };
        kthSmallestHelper(root, k, count, result);
        return result[0];
    }
    private static void kthSmallestHelper(TreeNode node, int k, int[] count, int[] result) {
        if (node == null || result[0] != -1) return;
        kthSmallestHelper(node.left, k, count, result);
        count[0]++;
        if (count[0] == k) {
            result[0] = node.val;
            return;
        }
        kthSmallestHelper(node.right, k, count, result);
    }
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            TreeNode root = null;
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                root = insertIntoBST(root, val);
            }
            int k = sc.nextInt();
            int result = kthSmallest(root, k);
            System.out.println(result);
        }
    }
}