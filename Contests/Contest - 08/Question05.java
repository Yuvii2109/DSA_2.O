import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
    Given the root of a binary tree, return its inorder traversal as a list of node values.

    Input Format - The binary tree is represented as an array in level-order traversal. Each integer represents a node's value. -1 indicates the absence of a node at a particular position. For example, the input - 10 20 30 73 50 60 73 represents the binary tree -
            10
           /  \
         20    30
        /  \   /  \
      73   50 60  73

    If the tree is incomplete, use null for missing nodes. For example - 10 20 30 73 -1 -1 73 represents the binary tree -
            10
           /  \
         20    30
        /        \
       73        73
    Constraints - The number of nodes in the tree is in the range [0, 1000]. -5000 ≤ Node.val ≤ 5000.
    Output Format - A list of integers representing the inorder traversal of the binary tree. Note - Do not modify or change anything inside the main function.
    Sample Input - 10 20 30 73 50 60 73
    Sample Output - 73 20 50 10 60 30 73
    Explanation - Representation the binary tree -
            10
           /  \
         20    30
        /  \   / \
      73   50 60  73
    Inorder traversal visits nodes in the order - Left -> Root -> Right.
    Steps for traversal -
        1. Traverse the left subtree of 10 -
            Left subtree of 20 is 73.
            Visit root 20.
            Right subtree of 20 is 50.
            Result - [73, 20, 50].
        2. Visit root 10.
        3. Traverse the right subtree of 10 -
            Left subtree of 30 is 60.
            Visit root 30.
            Right subtree of 30 is 73.Result - [60, 30, 73].
            Combined - [73, 20, 50, 10, 60, 30, 73].
*/

public class Question05 {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode buildTree(List<Integer> nodes) {
        if (nodes == null || nodes.isEmpty() || nodes.get(0) == -1) {
            return null;
        }

        TreeNode root = new TreeNode(nodes.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < nodes.size()) {
            TreeNode current = queue.poll();

            if (nodes.get(i) != -1) {
                current.left = new TreeNode(nodes.get(i));
                queue.offer(current.left);
            }
            i++;

            if (i < nodes.size() && nodes.get(i) != -1) {
                current.right = new TreeNode(nodes.get(i));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    public static void inorderHelper(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inorderHelper(node.left, res);
        res.add(node.val);
        inorderHelper(node.right, res);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        List<Integer> nodes = new ArrayList<>();
        for (String s : inputArr) {
            nodes.add(Integer.valueOf(s));
        }

        TreeNode root = buildTree(nodes);
        List<Integer> inorderResult = inorderTraversal(root);
        for (int val : inorderResult) {
            System.out.print(val + " ");
        }
    }
}