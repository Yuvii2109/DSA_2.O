/*
    Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

    The first node is considered odd, and the second node is even, and so on. Note that the relative order inside both the even and odd groups should remain as it was in the input.

    You must solve the problem in O(1) extra space complexity and O(n) time complexity.

    Example 1 -
        Input - head = [1,2,3,4,5]
        Output - [1,3,5,2,4]

    Example 2 -
        Input - head = [2,1,3,5,6,4,7]
        Output - [2,3,6,7,1,5,4]
*/

public class OddEvenLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head; // will build the odd-indexed list
        ListNode evenHead = head.next; // head of even-indexed list
        ListNode even = evenHead; // will build the even-indexed list
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }    
}