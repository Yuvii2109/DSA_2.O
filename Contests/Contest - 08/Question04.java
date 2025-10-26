/*
    You are given the root of a binary tree. Your task is to print the preorder traversal of the tree.

    Input Format - The input will be provided as follows -
        The first line contains an integer N, the number of elements in the level-order traversal.
        The second line contains N integers, representing the level-order traversal of the tree. Use -1 to represent null nodes.
    Constraints - 
        1 <= N <= 10^5 where N is the number of nodes in the tree.
        1 <= Node.val <= 10^5
    Output Format - Print the preorder traversal of the tree as a sequence of node values separated by spaces. Note - Do not modify or change anything inside the main function.
    Sample Input - 
        7
        3 9 20 -1 -1 15 7
    Sample Output - 3 9 20 15 7
    Explanation - The given level-order traversal corresponds to the following tree -
        3
       / \
      9  20
        /  \
       15   7
    Preorder traversal visits -
        3 (root)
        9 (left subtree of 3)
        20 (right subtree of 3)
        15 (left subtree of 20)
        7 (right subtree of 20)
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question04 {
    /*
        class BinaryTreeNode<T> {
            T data;
            BinaryTreeNode<T> left;
            BinaryTreeNode<T> right;
            public BinaryTreeNode(T data) {
                this.data = data;
            }
        }

        // Complete this function only
        public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root) {
            // User should complete this function
            ArrayList<Integer> list = new ArrayList<>();
            preorderHelper(root, list);
            return list;
        }
        private static void preorderHelper(BinaryTreeNode<Integer> node, ArrayList<Integer> list) {
            if(node == null) return;
            list.add(node.data);
            preorderHelper(node.left, list);
            preorderHelper(node.right, list);
        }

        private static BinaryTreeNode<Integer> buildTree(int[] arr) {
            if (arr.length == 0 || arr[0] == -1) return null;
            BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[0]);
            Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
            q.offer(root);
            int i = 1;
            while (!q.isEmpty() && i < arr.length) {
                BinaryTreeNode<Integer> node = q.poll();
                if (arr[i] != -1) {
                    node.left = new BinaryTreeNode<>(arr[i]);
                    q.offer(node.left);
                }
                i++;
                if (i < arr.length && arr[i] != -1) {
                    node.right = new BinaryTreeNode<>(arr[i]);
                    q.offer(node.right);
                }
                i++;
            }
            return root;
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(input[i]);
            BinaryTreeNode<Integer> root = buildTree(arr);
            ArrayList<Integer> ans = preorderTraversal(root);
            for (int val : ans) System.out.print(val + " ");
        }
    */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }
    }
    public static TreeNode buildTree(int[] values) {
        if(values.length == 0 || values[0] == -1) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values[0]);
        queue.add(root);
        int index = 1;

        while(!queue.isEmpty() && index < values.length){
            TreeNode node = queue.poll();

            if(index < values.length && values[index] != -1){
                node.left = new TreeNode(values[index]);
                queue.add(node.left);
            }
            index++;

            if(index < values.length && values[index] != -1){
                node.right = new TreeNode(values[index]);
                queue.add(node.right);
            }
            index++;
        }

        return root;
    }
    public static void preorderTraversal(TreeNode root) {
        if(root == null) return;
        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] values = new int[n];
            for(int i = 0; i < n; i++){
                values[i] = sc.nextInt();
            }
            TreeNode root = buildTree(values);
            preorderTraversal(root);
        }
    }
}