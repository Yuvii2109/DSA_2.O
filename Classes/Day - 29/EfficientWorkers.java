import java.util.Arrays;

public class EfficientWorkers {
    public static int findMinCost(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        // 1) Build prefixEven - optimal pairing cost on [0..i-1], pairing (0,1),(2,3),...
        int[] prefixEven = new int[n + 1];
        for(int i = 2; i <= n; i += 2){
            prefixEven[i] = prefixEven[i - 2] + (arr[i - 1] - arr[i - 2]);
        }

        // 2) Build suffixEven - optimal pairing cost on [i..n-1] pairing (i, i + 1),(i + 2, i + 3),...
        int[] suffixEven = new int[n + 1];  // So we can safely index i + 2 up to n + 1
        for(int i = n - 2; i >= 0; i--){
            suffixEven[i] = suffixEven[i + 2] + (arr[i + 1] - arr[i]);
        }

        int minCost = Integer.MAX_VALUE;

        // 3) Try removing each index i
        for(int i = 0; i < n; i++){
            int l1 = i, l2 = n - i - 1;
            int cost;

            if(l1 % 2 == 0 && l2 % 2 == 0){
                // both even
                cost = prefixEven[i] + suffixEven[i + 1];
            }else if (l1 % 2 == 0){
                // right odd ⇒ must drop one at the start of suffix
                cost = prefixEven[i] + suffixEven[i + 2];
            }else if (l2 % 2 == 0){
                // left odd ⇒ must drop one at the end of prefix
                cost = prefixEven[i - 1] + suffixEven[i + 1];
            }else{
                // both odd ⇒ pair arr[i-1] with arr[i+1] across the cut
                int cross = arr[i + 1] - arr[i - 1];
                cost = prefixEven[i - 1] + suffixEven[i + 2] + cross;
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
    // Yeh toh hogya har case ke liye kaam krne wala... But if we are provided with the fact that the length of the original array is always odd... then -
    public static int findMinCost2(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        int[] prefixCost = new int[n + 1];
        for(int i = 2; i <= n; i += 2){
            prefixCost[i] = prefixCost[i - 2] + (arr[i - 1] - arr[i - 2]);
        }
        int[] suffixCost = new int[n + 2];
        for(int i = n - 2; i >= 0; i -= 2){
            suffixCost[i] = suffixCost[i + 2] + (arr[i + 1] - arr[i]);
        }
        int minCost = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int cost;
            if(i % 2 == 0){
                // Both halves even
                cost = prefixCost[i] + suffixCost[i + 1];
            }else{
                // Both halves odd
                int loner = arr[i + 1] - arr[i - 1];
                cost = prefixCost[i - 1] + suffixCost[i + 2] + loner;
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }

    public static void main(String[] args){
        int[] arr = {4, 2, 8, 1, 9};
        System.out.println("Minimum Cost - " + findMinCost2(arr));
    }
}