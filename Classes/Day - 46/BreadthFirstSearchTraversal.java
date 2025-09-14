import java.util.LinkedList;
import java.util.Queue;

/*
    Breadth-First Search (BFS) or Level Order Traversal of a binary tree.

    Example -
        Input -
                 1
                / \
               2   3
              / \   \
             4   5   6

        Output -
            1
            2 3
            4 5 6

    Time Complexity - O(n)
    Space Complexity - O(n)
*/
public class BreadthFirstSearchTraversal {
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
    public static void bfs(TreeNode root) {
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // Level marker

        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode == null){
                System.out.println(); // End of current level
                if(!queue.isEmpty()){
                    queue.add(null); // Add level marker for next level
                }
            }else{
                System.out.print(currentNode.data + " ");
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println("Breadth-First Search (Level Order Traversal) -");
        bfs(root);
    }
}