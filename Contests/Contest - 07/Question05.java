
import java.util.Scanner;

/*
    Given three linked lists, say a, b and c, find one node from each list such that the sum of the values of the nodes is equal to a given number say, Target. As any number of answers can be possible return the first one you get while traversing.

    Input Format - The First Line contains 3 Integers n, m and k as the Size of the Three LinedLists. Next 3 Lines contains n, m and k integers Respectively as the elements of Linked Lists. Next Line contains the an Integer as Target.
    Constraints - The Size of the Lists can be different.
    Output Format - Display the 3 elements from each of the Lists whose sum is equals to the target separated by space.
    Sample Input - 
        3 3 3
        12 6 29
        23 5 8
        90 20 59
        101
    Sample Output - 6 5 90
    Explanation - In the Given Sample Input, 6, 5 and 90 from lists 1, 2 and 3 respectively add to give 101.
*/

public class Question05 {
    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void findTriplet(ListNode list1, ListNode list2, ListNode list3, int target){
        for(ListNode ptr1 = list1; ptr1 != null; ptr1 = ptr1.next){
            for(ListNode ptr2 = list2; ptr2 != null; ptr2 = ptr2.next){
                for(ListNode ptr3 = list3; ptr3 != null; ptr3 = ptr3.next){
                    if(ptr1.data + ptr2.data + ptr3.data == target){
                        System.out.println(ptr1.data + " " + ptr2.data + " " + ptr3.data);
                        return;
                    }
                }
            }
        }
        System.out.println("No such triplet found");
    }
    public static ListNode createLL(int n, Scanner sc){
        ListNode head = null;
        ListNode tail = null;
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
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
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            ListNode ListNode1 = createLL(n, sc);
            ListNode ListNode2 = createLL(m, sc);
            ListNode ListNode3 = createLL(k, sc);
            int target = sc.nextInt();
            findTriplet(ListNode1, ListNode2, ListNode3, target);
        }
    }
}