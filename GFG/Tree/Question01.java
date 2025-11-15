/*
    Given the root of a Binary Tree, your task is to return its Level Order Traversal. Note - A level order traversal is a breadth-first search (BFS) of the tree. It visits nodes level by level, starting from the root, and processes all nodes from left to right within each level before moving to the next.

    Examples -
        Input - root = [1, 2, 3]
        Output - [[1], [2, 3]]
        Explanation - We start with the root node 1, so the first level of the traversal is [1]. Then we move to its children 2 and 3, which form the next level, giving the final output [[1], [2, 3]].

        Input - root = [10, 20, 30, 40, 50]
        Output - [[10], [20, 30], [40, 50]]
        Explanation - We begin with the root node 10, which forms the first level as [10]. Its children 20 and 30 make up the second level, and their children 40 and 50 form the third level, resulting in [[10], [20, 30], [40, 50]].

    Constraints -
        1 ≤ number of nodes ≤ 3*104
        0 ≤ node->data ≤ 109
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Question01 {
    public static class Node {
        int data;
        Node left, right;

        @SuppressWarnings("unused")
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();
            
            for(int i = 0; i < levelSize; i++){
                Node current = queue.poll();
                currentLevel.add(current.data);
                
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}