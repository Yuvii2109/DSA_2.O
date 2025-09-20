import java.util.PriorityQueue;

public class BuiltInPriorityQueues {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public BuiltInPriorityQueues(){
        minHeap = new PriorityQueue<>(); // Min-Heap (default behavior)
        maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max-Heap using custom comparator
    }
    public void addToMinHeap(int value){
        minHeap.add(value);
    }
    public void addToMaxHeap(int value){
        maxHeap.add(value);
    }
    public Integer pollMin(){
        return minHeap.poll();
    }
    public Integer pollMax(){
        return maxHeap.poll();
    }
    public static void main(String[] args) {
        BuiltInPriorityQueues pq = new BuiltInPriorityQueues();
        
        // Adding elements to Min-Heap
        pq.addToMinHeap(5);
        pq.addToMinHeap(1);
        pq.addToMinHeap(3);
        
        System.out.println("Min-Heap - " + pq.minHeap);
        System.out.println("Min-Heap Poll - " + pq.pollMin());
        System.out.println("Min-Heap Poll - " + pq.pollMin());
        
        // Adding elements to Max-Heap
        pq.addToMaxHeap(5);
        pq.addToMaxHeap(1);
        pq.addToMaxHeap(3);
        
        System.out.println("Max-Heap - " + pq.maxHeap);
        System.out.println("Max-Heap Poll - " + pq.pollMax());
        System.out.println("Max-Heap Poll - " + pq.pollMax());
    }
}