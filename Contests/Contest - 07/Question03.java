/*
    Given a linked list of length N and an integer K , append the last K elements of a linked list to the front. Note that K can be greater than N.

    Input Format - First line contains a single integer N denoting the size of the linked list. Second line contains N space separated integers denoting the elements of the linked list. Third line contains a single integer K denoting the number of elements that are to be appended.

    Constraints - 
    1 <= N <= 10^4
    1 <= K <= 10^4

    Output Format - Display all the elements in the modified linked list.
    Sample Input - 
        7
        1 2 2 1 8 5 6
        3
    Sample Output - 8 5 6 1 2 2 1
    Explanation - 
        Initially the linked list is
        1 → 2 → 3 → 4 → 5 → 6 → null
        and k = 2. After appending the last two elements to the front, the new linked list looks like
        5 → 6 → 1 → 2 → 3 → 4 → null
*/

import java.util.Scanner;

public class Question03 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node appendK(Node head, int k){
        if(head == null || k <= 0){
            return head;
        }

        // Calculate the length of the linked list
        Node current = head;
        int length = 1;
        while(current.next != null){
            current = current.next;
            length++;
        }

        // If k is greater than or equal to length, adjust k
        k = k % length;
        if(k == 0){
            return head; // No change needed
        }

        // Find the new tail and new head
        Node newTail = head;
        for(int i = 1; i < length - k; i++){
            newTail = newTail.next;
        }
        Node newHead = newTail.next;

        // Break the link and re-link the nodes
        newTail.next = null;
        current.next = head;

        return newHead;
    }
    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            Node head = null;
            Node tail = null;

            for(int i = 0; i < n; i++){
                int data = sc.nextInt();
                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }else if(tail != null){
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            int k = sc.nextInt();

            System.out.println("Original List -");
            printList(head);

            head = appendK(head, k);

            System.out.println("Modified List after appending last " + k + " elements to the front -");
            printList(head);
        }
    }
}