/*
    Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

    Example 1 -
        Input - head = [1,2,3,4,5], left = 2, right = 4
        Output - [1,4,3,2,5]

    Example 2 -
        Input - head = [5], left = 1, right = 1
        Output - [5]

    Constraints -
        The number of nodes in the list is n.
        1 <= n <= 500
        -500 <= Node.val <= 500
        1 <= left <= right <= n
*/

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseTheLLII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        for(int i = 1; i < left; i++){
            prev = prev.next;
        }
        // start will point to the first node of the sublist to be reversed
        ListNode start = prev.next;
        // then is the node that will be moved one by one to the front of the sublist
        ListNode then = start.next;
        for(int i = 0; i < right-left; i++){
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return dummy.next;
    }
}