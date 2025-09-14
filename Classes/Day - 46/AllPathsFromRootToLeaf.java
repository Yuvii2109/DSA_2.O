
import java.util.ArrayList;
import java.util.List;

/*
    Given the root of a binary tree, return all root-to-leaf paths in any order.

    A leaf is a node with no children.

    Example 1 -
        Input - root = [1,2,3,null,5]
        Output - ["1->2->5", "1->3"]

    Example 2 -
        Input - root = [1]
        Output - ["1"]

    Constraints -
        The number of nodes in the tree is in the range [1, 100].
        -100 <= Node.val <= 100
*/

public class AllPathsFromRootToLeaf {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        @SuppressWarnings("unused")
        TreeNode() {}
        @SuppressWarnings("unused")
        TreeNode(int val) { this.val = val; }
        @SuppressWarnings("unused")
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root == null){
            return paths;
        }
        dfs(root, new StringBuilder(), paths);
        return paths;
    }
    private void dfs(TreeNode node, StringBuilder currentPath, List<String> paths){
        int lenBefore = currentPath.length();
        currentPath.append(node.val);
        if(node.left == null && node.right == null){
            paths.add(currentPath.toString());
        }else{
            currentPath.append("->");
            if(node.left != null){
                dfs(node.left, currentPath, paths);
            }
            if(node.right != null){
                dfs(node.right, currentPath, paths);
            }
        }
        currentPath.setLength(lenBefore);
    }
}