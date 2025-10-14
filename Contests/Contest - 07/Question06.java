import java.util.Scanner;

/*
    Given two numbers represented by two linked lists, write a program that prints the sum list. The sum list is linked list representation of addition of two input numbers in linked lists. It is not allowed to modify the lists. Also, not allowed to use explicit extra space (Use Recursion).
    
    Input Format - First line contains N,M, number of nodes in the 1st and 2nd list. Next line contains N nodes of 1st list. Next line contains M nodes of 2nd list.
    Constraints - 0<N<10^6
    Output Format - Print the sum list after adding the two linked lists.
    Sample Input - 
        3 3
        5 6 3
        8 4 2
    Sample Output - 1 4 0 5
    Explanation - After adding the two numbers represented by linked lists i.e. 563 + 842 =1405 is represented as sum list. Sum list = 1 -> 4 -> 0 -> 5.

*/

public class Question06 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node createLL(int n, Scanner sc){
        Node head = null;
        Node tail = null;
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else if(tail != null){
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
    public static int getLength(Node head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
    }
    public static Node addTwoLists(Node first, Node second){
        int len1 = getLength(first);
        int len2 = getLength(second);
        if(len1 < len2){
            Node temp = first;
            first = second;
            second = temp;
            int t = len1;
            len1 = len2;
            len2 = t;
        }
        int diff = len1 - len2;
        Node dummy = new Node(0);
        Node current = dummy;
        Node ptr1 = first;
        Node ptr2 = second;
        for(int i = 0; i < diff; i++){
            current.next = new Node(ptr1.data);
            current = current.next;
            ptr1 = ptr1.next;
        }
        while(ptr1 != null && ptr2 != null){
            int sum = ptr1.data + ptr2.data;
            current.next = new Node(sum);
            current = current.next;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        int carry = addCarry(dummy.next);
        if(carry > 0){
            Node newHead = new Node(carry);
            newHead.next = dummy.next;
            return newHead;
        }
        return dummy.next;
    }
    public static int addCarry(Node head){
        if(head == null) return 0;
        int carry = addCarry(head.next);
        int sum = head.data + carry;
        head.data = sum % 10;
        return sum / 10;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Node ListNode1 = createLL(n, sc);
            Node ListNode2 = createLL(m, sc);
            Node result = addTwoLists(ListNode1, ListNode2);
            while(result != null){
                System.out.print(result.data + " ");
                result = result.next;
            }
        }
    }
}