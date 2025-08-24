class Node {
    int value;
    Node next;
    Node(int value){
        this.value = value;
        this.next = null;
    }
}

public class StartingWithLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}