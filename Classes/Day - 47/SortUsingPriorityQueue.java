public class SortUsingPriorityQueue {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();

        // Add all elements to the min-heap
        for(int num : arr){
            minHeap.add(num);
        }

        // Extract elements from the min-heap to get them in sorted order
        int index = 0;
        while(!minHeap.isEmpty()){
            arr[index++] = minHeap.poll();
        }

        System.out.println("Sorted array - ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}