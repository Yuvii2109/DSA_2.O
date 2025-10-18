
import java.util.Scanner;

/*
    Given a list, modify it such that all odd elements appear before the even ones. The order of odd elements and even shall remain intact.

    Input Format - The first line contains an integer N, the number of elements in the list. The next line contains N space separated integral elements of the list.
    Constraints - 1 <= T <= 1000 0 <= N <= 10^6
    Output Format - T lines of output
    Sample Input - 
        5
        1 2 3 4 5
    Sample Output - 1 3 5 2 4 
    Explanation - 
        Input - 1 -> 2 -> 3 -> 11-> 4 -> 5
        The order of odd elements and even does not change. For instance 3 comes before 5 in the input, so comes in the output.
        Output - 1 -> 3 -> 11 -> 5 -> 2 -> 4
*/

public class Question08 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node segregateEvenOdd(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;
        Node current = head;

        while(current != null){
            if(current.data % 2 != 0){ // Odd
                if(oddHead == null){
                    oddHead = current;
                    oddTail = current;
                }else if(oddTail != null){
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }else{ // Even
                if(evenHead == null){
                    evenHead = current;
                    evenTail = current;
                }else if(evenTail != null){
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            }
            current = current.next;
        }

        // If there are no odd elements
        if(oddHead == null){
            return evenHead;
        }

        // If there are no even elements
        if(evenHead == null){
            return oddHead;
        }

        // Combine odd and even lists
        if(oddTail != null){
            oddTail.next = evenHead;
        }
        if(evenTail != null){
            evenTail.next = null; // End the list
        }

        return oddHead;
    }
    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static Node createLL(int n, Scanner sc){
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
        return head;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            Node head = createLL(n, sc);
            head = segregateEvenOdd(head);
            printList(head);
        }
    }
}