import java.util.LinkedList;
import java.util.Queue;

public class BuildBinaryTreeUsingLevelOrder {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode buildTree(int[] levelOrder) {
        if(levelOrder.length == 0) return null;

        TreeNode root = new TreeNode(levelOrder[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while(i < levelOrder.length){
            TreeNode currentNode = queue.poll();

            // Assign left child
            if(i < levelOrder.length){
                currentNode.left = new TreeNode(levelOrder[i++]);
                queue.add(currentNode.left);
            }

            // Assign right child
            if(i < levelOrder.length){
                currentNode.right = new TreeNode(levelOrder[i++]);
                queue.add(currentNode.right);
            }
        }
        return root;
    }
    public static void inorderTraversal(TreeNode root) {
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int[] levelOrder = {1, 2, 3, 4, 5, 6};
        TreeNode root = buildTree(levelOrder);
        System.out.println("Inorder Traversal of the constructed tree -");
        inorderTraversal(root);
    }
}

/*
    Breadth First Search (BFS) or Level Order Traversal of a Binary Tree
    Example -
    Input -
            1
           / \
          2   3
         /\   /
        4  5 6

    Output -
            1
            2 3
            4 5 6

    Time Complexity - O(n)
    Space Complexity - O(n)
*/