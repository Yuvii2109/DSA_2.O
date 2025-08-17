import java.util.ArrayList;
import java.util.NoSuchElementException;

class MyQueue {
    private final ArrayList<Integer> arr = new ArrayList<>();
    private int head = 0;

    // Add to the end
    public void enqueue(int v) {
        arr.add(v);
    }

    // Remove and return front element; throws if empty
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int val = arr.get(head);
        // help garbage collector
        arr.set(head, null);
        head++;

        // simple compaction to keep list small after many dequeues
        if (head >= 50 && head * 2 >= arr.size()) {
            arr.subList(0, head).clear();
            head = 0;
        }
        return val;
    }

    // Return front element without removing; returns null-like value by throwing if empty
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return arr.get(head);
    }

    public boolean isEmpty() {
        return head >= arr.size();
    }

    public int size() {
        return arr.size() - head;
    }

    // optional - clear queue
    public void clear() {
        arr.clear();
        head = 0;
    }
}

public class StartingWithQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        System.out.println(q.size()); // 0
        q.enqueue(21);
        q.enqueue(23);
        System.out.println(q.peek()); // 21
        System.out.println(q.size()); // 2
        System.out.println(q.isEmpty()); // false

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }

        // safer way to remove when you aren't sure if it's empty -
        if (!q.isEmpty()) {
            System.out.println(q.dequeue());
        } else {
            System.out.println("Queue is empty - not dequeuing.");
        }

        System.out.println(q.size()); // 0
    }
}