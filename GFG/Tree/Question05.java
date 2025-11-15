/*
    Given two arrays representing the inorder and preorder traversals of a binary tree, your task is to construct the binary tree and return its root. Note - The inorder and preorder traversals contain unique values, and every value present in the preorder traversal is also found in the inorder traversal.

    Examples -
        Input - inorder[] = [3, 1, 4, 0, 5, 2], preorder[] = [0, 1, 3, 4, 2, 5]
        Output - [0, 1, 2, 3, 4, 5]
        Explanation - The tree will look like

        Input - inorder[] = [2, 5, 4, 1, 3], preorder[] = [1, 4, 5, 2, 3]
        Output - [1, 4, 3, 5, N, N, N, 2]
        Explanation - The tree will look like

    Constraints -
        1 ≤ number of nodes ≤ 103
        0 ≤ nodes -> data ≤ 103
        Both the inorder and preorder arrays contain unique values.
*/

public class Question05 {
    public static class Node {
        @SuppressWarnings("unused")
        int data;
        @SuppressWarnings("unused")
        Node left;
        @SuppressWarnings("unused")
        Node right;

        @SuppressWarnings("unused")
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static Node buildTree(int inorder[], int preorder[]) {
        return buildTreeHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private static Node buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }
        int rootVal = preorder[preStart];
        Node root = new Node(rootVal);
        int inorderIndex = inStart;
        while(inorderIndex <= inEnd && inorder[inorderIndex] != rootVal){
            inorderIndex++;
        }
        int leftTreeSize = inorderIndex - inStart;
        root.left = buildTreeHelper(preorder, preStart + 1, preStart + leftTreeSize, inorder, inStart, inorderIndex - 1);
        root.right = buildTreeHelper(preorder, preStart + leftTreeSize + 1, preEnd, inorder, inorderIndex + 1, inEnd);
        return root;
    }
}