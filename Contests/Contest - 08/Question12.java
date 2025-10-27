/*
    You are given two integer arrays preorder and inorder representing the preorder and inorder traversal of a binary tree, respectively. Your task is to reconstruct the binary tree and return its level order traversal.

    Input Format - The first line contains an integer n, the number of nodes in the tree. The second line contains n space-separated integers representing the preorder traversal of the tree. The third line contains n space-separated integers representing the inorder traversal of the tree.

    Constraints - 
        1 ≤ n ≤ 105
        1 ≤ Node.val ≤ 105
    Output Format - Print the level order traversal of the reconstructed binary tree in a single line, with each node value separated by a space.
    Sample Input - 
        7
        1 2 4 5 3 6 7
        4 2 5 1 6 3 7
    Sample Output - 1 2 3 4 5 6 7
    Explanation
    Given the following traversals -
        Preorder - [1, 2, 4, 5, 3, 6, 7]
        Inorder - [4, 2, 5, 1, 6, 3, 7]
    The binary tree reconstructed from these traversals is -
            1
           / \
          2   3
         / \ / \
        4  5 6  7
    The level order traversal of this tree is - 1 2 3 4 5 6 7.
*/

import java.util.Scanner;

public class Question12 {
    public static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private static TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        int inRootIndex = inStart;
        while (inRootIndex <= inEnd && inorder[inRootIndex] != rootVal) {
            inRootIndex++;
        }
        int leftTreeSize = inRootIndex - inStart;

        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, inRootIndex - 1);
        root.right = buildTreeHelper(preorder, preStart + leftTreeSize + 1, preEnd, inorder, inRootIndex + 1, inEnd);

        return root;
    }
    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] preorder = new int[n];
            int[] inorder = new int[n];
            for(int i=0;i<n;i++){
                preorder[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                inorder[i] = sc.nextInt();
            }
            TreeNode root = buildTree(preorder, inorder);
            printLevelOrder(root);
        }
    }
}