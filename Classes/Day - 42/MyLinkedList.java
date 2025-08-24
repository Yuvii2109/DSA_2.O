public class MyLinkedList {
    private static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
        }
    }
    private Node head = null;
    public void insertAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int value){
        if(head != null){
            Node newNode = new Node(value);
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }else{
            Node newNode = new Node(value);
            head = newNode;
        }
    }
    public int getSize(){
        int size = 0;
        Node current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }
    public int deleteFromBeginning(){
        if(head == null){
            System.out.println("Gareeb ko kya hi lootega bhai?");
            return -1;
        }else{
            int val = head.value;
            Node removed = head;
            head = head.next;
            removed.next = null;
            return val;
        }
    }
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("Gareeb ko kya hi lootega bhai?");
        }else{
            Node current = head;
            if(current.next == null){
                head = null;
            }
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }
    public void printLL(){
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.insertAtEnd(2);
        ll.printLL();
        ll.insertAtEnd(3);
        ll.printLL();
        ll.insertAtEnd(4);
        ll.printLL();
        ll.insertAtEnd(5);
        ll.printLL();
        ll.insertAtBeginning(1);
        ll.printLL();
        ll.deleteFromBeginning();
        ll.printLL();
        ll.deleteFromBeginning();
        ll.printLL();
        ll.deleteFromBeginning();
        ll.printLL();
        ll.deleteFromBeginning();
        ll.printLL();
        ll.deleteFromBeginning();
        ll.printLL();
        ll.deleteFromBeginning();
    }
}