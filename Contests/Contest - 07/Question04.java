/*
    You are given two singly linked lists, each sorted in ascending order. Your task is to merge these two linked lists into one sorted linked list and return the head of the merged list.

    Input Format - The first line contains an integer n — the size of the first linked list. The second line contains n space-separated integers, representing the elements of the first linked list. The third line contains an integer m — the size of the second linked list. The fourth line contains m space-separated integers, representing the elements of the second linked list.

    Constraints - 
        0 ≤ n, m ≤ 105
        -106 ≤ Node Value ≤ 106
    The input linked lists are sorted in ascending order.

    Output Format - Output a single line containing the elements of the merged linked list, separated by spaces.
    Note - Do not modify or change anything inside the main function.
    Sample Input - 
        3
        1 2 4
        3
        1 3 4
    Sample Output - 
        1 1 2 3 4 4
    Explanation - The two linked lists are merged by comparing values step-by-step. Starting with 1 from both lists, the smaller (or equal) value is added to the result. This process continues: 1 (List 1), 1 (List 2), 2 (List 1), 3 (list 2), 4 (List 1), and 4 (List 2), resulting in the merged list - 1 -> 1 -> 2 -> 3 -> 4 -> 4.
*/

import java.util.Scanner;

public class Question04 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Complete this function only. Do not modify anything inside the main function.
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null){
            current.next = l1;
        }else{
            current.next = l2;
        }
        return dummy.next;
    }

    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values1 = new int[n];
        for (int i = 0; i < n; i++) {
            values1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] values2 = new int[m];
        for (int i = 0; i < m; i++) {
            values2[i] = scanner.nextInt();
        }

        ListNode l1 = createList(values1);
        ListNode l2 = createList(values2);

        ListNode merged = mergeTwoLists(l1, l2);
        printList(merged);
    }
}