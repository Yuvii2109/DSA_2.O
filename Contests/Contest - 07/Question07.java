
import java.util.Scanner;

/*
    Given a linked list with n nodes. Find the kth element from last without computing the length of the linked list.

    Input Format - First line contains space separated integers representing the node values of the linked list. The list ends when the input comes as '-1'. The next line contains a single integer k.
    Constraints - n < 10^5
    Output Format - Output a single line containing the node value at the kth element from last.
    Sample Input - 
        1 2 3 4 5 6 -1
        3
    Sample Output - 4
    Explanation - The linked list is 1 2 3 4 5 6. -1 is not included in the list. So the third element from the last is 4
*/

public class Question07 {
    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode createLL(Scanner sc){
        ListNode head = null;
        ListNode tail = null;
        while(true){
            int value = sc.nextInt();
            if(value == -1) break;
            ListNode newNode = new ListNode(value);
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
    public static void findKthFromEnd(ListNode head, int k){
        if(head == null || k <= 0){
            System.out.println("Invalid input");
            return;
        }

        ListNode first = head;
        ListNode second = head;

        // Move first pointer k nodes ahead
        for(int i = 0; i < k; i++){
            if(first == null){
                System.out.println("K is greater than the length of the list");
                return;
            }
            first = first.next;
        }

        // Move both pointers until first reaches the end
        while(first != null){
            first = first.next;
            second = second.next;
        }

        // Now second points to the kth node from the end
        System.out.println(second.data);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            ListNode head = createLL(sc);
            int k = sc.nextInt();
            findKthFromEnd(head, k);
        }
    }
}