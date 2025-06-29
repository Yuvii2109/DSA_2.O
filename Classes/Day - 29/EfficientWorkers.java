import java.util.Arrays;

public class EfficientWorkers {
    public static int findMinCost(int[] arr){
        int n = arr.length;
        if(n % 2 == 0){
            return -1;
        }
        Arrays.sort(arr);
        int prefixCost[] = new int[n + 1];
        int suffixCost[] = new int[n + 1];
        // Pairs are being made as -> 0-1, 2-3, 4-5... to execute easy elimination.
        for(int i = 2; i <= n; i += 2){
            prefixCost[i] = prefixCost[i - 2] + (arr[i - 1] - arr[i - 2]);
        }
        for(int i = n - 2; i >= 0; i -= 2){
            suffixCost[i] = suffixCost[i + 2] + (arr[i + 1] - arr[i]);
        }
        int minCost = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int leftPairIndex = i - (i % 2);
            int leftPair = prefixCost[leftPairIndex];
            // Delete hone par... array divide ho raha hai... suppose ith wala remove ho raha hai then... array 2 parts main toota... 
            // Part 1 length = i
            // Part 2 length = n - i - 1
            int rightPairIndex = (i + 1) + ((n - i - 1) % 2);
            int rightPair = suffixCost[rightPairIndex];
            minCost = Math.min(minCost, (leftPair + rightPair));
        }
        return minCost;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 8, 1, 9};
        int cost = findMinCost(arr);
        System.out.println("Minimum Cost - " + cost);
    }
}