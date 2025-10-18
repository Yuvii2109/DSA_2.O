
import java.util.Scanner;

/*
    Given a head to Linked List L, write a function to reverse the list taking k elements at a time. Assume k is a factor of the size of List.

    You need not have to create a new list. Just reverse the old one using head.

    Input Format - The first line contains 2 space separated integers N and K
    The next line contains N space separated integral elements of the list.
    Constraints - 0 <= N <= 10^6 0 <= K <= 10^6
    Output Format - Display the linkedlist after reversing every k elements
    Sample Input - 
        9 3
        9 4 1 7 8 3 2 6 5
    Sample Output - 1 4 9 3 8 7 5 6 2
    Explanation - 
        N = 9 & K = 3
        Original LL is - 9 -> 4 -> 1 -> 7 -> 8 -> 3 -> 2 -> 6 -> 5
        After k Reverse - 1 -> 4 -> 9 -> 3 -> 8 -> 7 -> 5 -> 6 -> 2
*/

public class Question09 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node kReverse(Node head, int k){
        if(head == null || head.next == null || k <= 1){
            return head;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        // Reverse first k nodes of the linked list
        while(current != null && count < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Now next points to (k+1)th node
        // Recursively call for the list starting from current.
        // And make rest of the list as next of first node
        if(next != null){
            head.next = kReverse(next, k);
        }

        // prev is now head of the input list
        return prev;
    }
    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int k = sc.nextInt();

            Node head = null, tail = null;
            for(int i = 0; i < n; i++){
                int data = sc.nextInt();
                Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }else if(tail != null){
                    tail.next = newNode;
                    tail = tail.next;
                }
            }

            head = kReverse(head, k);
            printList(head);
        }
    }
}