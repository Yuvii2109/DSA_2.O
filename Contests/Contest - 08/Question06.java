
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
    You are given the root of a binary tree. Your task is to print the postorder traversal of the tree.

    Input Format - The first line contains an integer N, the number of elements in the level-order traversal of the tree. The second line contains N integers representing the level-order traversal of the tree. Use -1 to indicate null (non-existent) nodes.
    Constraint - 
        1 <= N <= 10^5
        1 <= Node.val <= 10^5
    Output Format - Print the postorder traversal of the given binary tree as a sequence of node values separated by spaces. Note - Do not modify or change anything inside the main function.
    Sample Input - 
        7
        3 9 20 -1 -1 15 7
    Sample Output - 9 15 7 20 3
    Explanation - The tree is -
        3
       / \
      9  20
        /  \
       15   7
        Performing a postorder traversal (Left → Right → Node) on this tree -
            Left subtree of 3 is just 9 - postorder is 9.
            Right subtree of 3 is rooted at 20 -
            Left child - 15
            Right child - 7
            Then node 20 after its children
            Postorder here - 15 7 20
            Finally, visit the root (3).
*/

public class Question06 {
    public static class TreeNode<T> {
        T data;
        TreeNode<T> left;
        TreeNode<T> right;
        TreeNode(T data) {
            this.data = data;
        }
    }
    // complete the func only dont change main function
    public static List<Integer> postorderTraversal(TreeNode<Integer> root) {
        List<Integer> result = new LinkedList<>();
        postorderHelper(root, result);
        return result;
    }
    private static void postorderHelper(TreeNode<Integer> node, List<Integer> result) {
        if (node == null) return;
        postorderHelper(node.left, result);
        postorderHelper(node.right, result);
        result.add(node.data);
    }

    private static TreeNode<Integer> buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return null;
        TreeNode<Integer> root = new TreeNode<>(arr[0]);
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.offer(root);
        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            TreeNode<Integer> node = q.poll();
            if (arr[i] != -1) {
                node.left = new TreeNode<>(arr[i]);
                q.offer(node.left);
            }
            i++;
            if (i < arr.length && arr[i] != -1) {
                node.right = new TreeNode<>(arr[i]);
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
        TreeNode<Integer> root = buildTree(arr);
        List<Integer> ans = postorderTraversal(root);
        for (int val : ans) System.out.print(val + " ");
    }
}
