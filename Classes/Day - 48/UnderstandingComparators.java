import java.util.PriorityQueue;

public class UnderstandingComparators {
    public static void main(String[] args) {
        // Example usage of a comparator
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);
        // This creates a min-heap where the smallest element has the highest priority and will be removed first when polling from the queue.
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(3);
        
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }
    }
}