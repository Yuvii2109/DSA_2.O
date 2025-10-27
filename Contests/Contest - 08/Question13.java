import java.util.Scanner;

/*
    Replace each node with the sum of all greater nodes in a given BST

    Input Format - Enter the number of nodes N and add N more numbers to the BST
    Constraints - None
    Output Format - Display the resulting tree
    Sample Input - 
        3
        2
        1
        3
    Sample Output -
        5 => 3 <= 0
        END => 5 <= END
        END => 0 <= END
*/

public class Question13 {
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
    public static void replaceWithSumOfGreaterNodes(TreeNode root) {
        int[] sum = {0};
        replaceHelper(root, sum);
    }
    private static void replaceHelper(TreeNode node, int[] sum) {
        if (node == null) return;
        replaceHelper(node.right, sum);
        int originalVal = node.val;
        node.val = sum[0];
        sum[0] += originalVal;
        replaceHelper(node.left, sum);
    }
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        String leftVal = (root.left != null) ? String.valueOf(root.left.val) : "END";
        String rightVal = (root.right != null) ? String.valueOf(root.right.val) : "END";
        System.out.println(leftVal + " => " + root.val + " <= " + rightVal);
        printInOrder(root.left);
        printInOrder(root.right);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            TreeNode root = null;
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                root = insertIntoBST(root, val);
            }
            replaceWithSumOfGreaterNodes(root);
            printInOrder(root);
        }
    }
}