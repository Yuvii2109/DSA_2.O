
import java.util.Scanner;

/*
    Given a Binary Tree Print all the leaf nodes.

    Input Format - Level order input of the binary tree
    Constraints - Total no of nodes <1000
    Output Format - All leaf nodes from left to right in single line
    Sample Input - 
        1
        2 3
        4 5
        6 7
        -1 -1
        -1 -1
        -1 -1
        -1 -1
    Sample Output - 4 5 6 7
*/

public class Question14 {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static class BinaryTree {
        private TreeNode root;

        public void buildTree(Scanner sc) {
            java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
            int rootVal = sc.nextInt();
            if (rootVal == -1) {
                root = null;
                return;
            }
            root = new TreeNode(rootVal);
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode current = queue.poll();
                int leftVal = sc.nextInt();
                int rightVal = sc.nextInt();

                if (leftVal != -1) {
                    current.left = new TreeNode(leftVal);
                    queue.add(current.left);
                }
                if (rightVal != -1) {
                    current.right = new TreeNode(rightVal);
                    queue.add(current.right);
                }
            }
        }
        public void printLeafNodes() {
            printLeafNodesHelper(root);
            System.out.println();
        }

        private void printLeafNodesHelper(TreeNode node) {
            if (node == null) return;
            if (node.left == null && node.right == null) {
                System.out.print(node.val + " ");
            }
            printLeafNodesHelper(node.left);
            printLeafNodesHelper(node.right);
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            BinaryTree bt = new BinaryTree();
            bt.buildTree(sc);
            bt.printLeafNodes();
        }
    }
}