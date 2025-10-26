
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
    Given a binary tree, return the left view of the tree. The left view of a binary tree contains the nodes that are visible when the tree is viewed from the left side. In other words, the leftmost node of each level should be included in the result.
    Input Format - The input is given in a level-order traversal format with the following rules -
        Each node is represented by an integer.
        -1 represents a null node (i.e., no child for that position).
    Constraints - 1 <= number of nodes in the tree <= 10^5
    Output Format - A single line containing the left view of the binary tree, with the values separated by spaces. Note - Do not modify or change anything inside the main function.
    Sample Input - 7 10 -1 7 1 -1 -1 5 -1 -1 9 -1 -1
    Sample Output - 7 10 7 5 9
    Explanation - Tree Representation -
            7
           /
          10
         /  \
        7    1
              \
               5
                \
                 9
    Steps to Determine the Left View -
        Level 1 - Node 7 (Root node, always visible).
        Level 2 - Node 10 (Leftmost node of this level).
        Level 3 - Node 7 (Leftmost node of this level).
        Level 4 - Node 5 (Leftmost node of this level).
        Level 5 - Node 9 (Leftmost node of this level).
*/

public class Question07 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        TreeNode root = buildTree(input);
        List<Integer> result = leftSideView(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    static TreeNode buildTree(String[] input) {
        if (input.length == 0 || input[0].equals("-1")) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(input[0]));
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < input.length) {
            TreeNode current = queue.poll();
            if (!input[i].equals("-1")) {
                current.left = new TreeNode(Integer.parseInt(input[i]));
                queue.add(current.left);
            }
            i++;
            if (i < input.length && !input[i].equals("-1")) {
                current.right = new TreeNode(Integer.parseInt(input[i]));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    // Complete the leftSideView function below
    static List<Integer> leftSideView(TreeNode root) {
        // Your code here
        List<Integer> leftView = new LinkedList<>();
        if(root == null) return leftView;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            for(int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if(i == 0) {
                    leftView.add(currentNode.val);
                }
                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }
        return leftView;
    }
}