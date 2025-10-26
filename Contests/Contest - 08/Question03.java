
import java.util.Scanner;

/*
    Given a BST and an integer k, print the kth largest element in the BST without modifying the BST. Can you do it in O(n) time ?
    
    Input Format - First line contains the number of nodes. Next line contains n space separated integers denoting the elements of the BST. Insert them into the BST as given in order. Third line contains a single line integer k
    Output Format - Print the kth largest value in the BST
    Sample Input  -
        6
        4 2 3 9 5 1
        3
    Sample Output - 4
*/

public class Question03 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x){
            this.val = x;
        }
    }
    public static void insertIntoBST(TreeNode root, int val) {
        if(val < root.val){
            if(root.left == null){
                root.left = new TreeNode(val);
            }else{
                insertIntoBST(root.left, val);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode(val);
            }else{
                insertIntoBST(root.right, val);
            }
        }
    }

    /*
        Parameters - 
            root - current node
            k - the kth largest element to find
            count - array of size 1 to keep track of number of nodes visited so far
            result - array of size 1 to store the kth largest value once found
    */
    public static void findKthLargest(TreeNode root, int k, int[] count, int[] result){
        if(root == null || result[0] != 0){
            return;
        }
        // Traverse right subtree first (reverse in-order)
        findKthLargest(root.right, k, count, result);
        
        // Increment count of visited nodes
        count[0]++;
        
        // If count is equal to k, we found our kth largest
        if(count[0] == k){
            result[0] = root.val;
            return;
        }
        
        // Traverse left subtree
        findKthLargest(root.left, k, count, result);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            TreeNode root = null;
            for(int i = 0; i < n; i++){
                int val = sc.nextInt();
                if(root == null){
                    root = new TreeNode(val);
                }else{
                    insertIntoBST(root, val);
                }
            }
            int k = sc.nextInt();
            int[] count = new int[1];
            int[] result = new int[1];
            findKthLargest(root, k, count, result);
            System.out.println(result[0]);
        }
    }
}