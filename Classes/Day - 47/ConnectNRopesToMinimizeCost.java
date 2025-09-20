/*
    Given an array arr[] of rope lengths, connect all ropes into a single rope with the minimum total cost. The cost to connect two ropes is the sum of their lengths.

    Examples -
        Input - arr[] = [4, 3, 2, 6]
        Output - 29
        Explanation - We can connect the ropes in following ways.
        1) First connect ropes of lengths 2 and 3. Which makes the array [4, 5, 6]. Cost of this operation 2 + 3 = 5. 
        2) Now connect ropes of lengths 4 and 5. Which makes the array [9, 6]. Cost of this operation 4 + 5 = 9.
        3) Finally connect the two ropes and all ropes have connected. Cost of this operation 9 + 6 =15. Total cost is 5 + 9 + 15 = 29. This is the optimized cost for connecting ropes. 

        Other ways of connecting ropes would always have same or more cost. For example, if we connect 4 and 6 first (we get three rope of 3, 2 and 10), then connect 10 and 3 (we get two rope of 13 and 2). Finally we connect 13 and 2. Total cost in this way is 10 + 13 + 15 = 38.

    Connect-n-ropes-with-minimum-cost
        Input - arr[] = [10]
        Output - 0
        Explanation - Since there is only one rope, no connections are needed, so the cost is 0.
*/

public class ConnectNRopesToMinimizeCost {
    public static void main(String args[]){
        int arr[] = {4, 3, 2, 6};
        java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();

        // Add all rope lengths to the min-heap
        for(int length : arr){
            minHeap.add(length);
        }

        int totalCost = 0;

        // While there is more than one rope to connect
        while(minHeap.size() > 1){
            // Extract the two smallest ropes
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Connect them and calculate the cost
            int cost = first + second;
            totalCost += cost;

            // Add the connected rope back to the min-heap
            minHeap.add(cost);
        }

        System.out.println("Minimum cost to connect all ropes - " + totalCost);
    }
}