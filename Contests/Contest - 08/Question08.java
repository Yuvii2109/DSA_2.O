
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

/*
    Given a binary tree, your task is to compute its Bottom-Level View. The Bottom-Level View of a binary tree is a view of the tree from the bottom, where for each horizontal distance from the root, the node visible is the one that appears last in the level order traversal (i.e., the lowest node at that horizontal distance).

    Input Format - The first line of input contains space-separated integers representing the nodes of the binary tree in level order traversal. A value of -1 indicates that the corresponding child is NULL and does not exist.
    Constraints - 
        1 ≤ Number of nodes ≤ 105
        1 ≤ Node.val ≤ 105
    Output Format - Print the Bottom-Level View of the binary tree as space-separated integers, ordered from the leftmost horizontal distance to the rightmost. Note - Do not modify or change anything inside the main function.
    Sample Input - 20 8 22 5 3 -1 25 -1 -1 10 14
    Sample Output - 5 10 3 14 25
    Explanation - The given binary tree is -
              20
            /    \
           8      22
         /   \      \
        5     3     25
             /  \
           10    14
    The Bottom-Level View of the tree is 5, 10, 3, 14, 25.
*/

public class Question08 {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Node root = buildTree(input);
        List<Integer> result = bottomView(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    static Node buildTree(String[] input) {
        if (input.length == 0 || input[0].equals("-1")) return null;
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(Integer.parseInt(input[0]));
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < input.length) {
            Node current = queue.poll();
            if (!input[i].equals("-1")) {
                current.left = new Node(Integer.parseInt(input[i]));
                queue.add(current.left);
            }
            i++;
            if (i < input.length && !input[i].equals("-1")) {
                current.right = new Node(Integer.parseInt(input[i]));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    // Complete this function only, do not modify anything in the main function
    static List<Integer> bottomView(Node root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) return result;

        class Pair {
            Node node;
            int hd; // horizontal distance
            Pair(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> hdNodeMap = new TreeMap<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            hdNodeMap.put(current.hd, current.node.val);

            if (current.node.left != null) {
                queue.offer(new Pair(current.node.left, current.hd - 1));
            }
            if (current.node.right != null) {
                queue.offer(new Pair(current.node.right, current.hd + 1));
            }
        }

        for (int val : hdNodeMap.values()) {
            result.add(val);
        }

        return result;
    }
}