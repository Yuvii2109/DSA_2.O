import java.util.Arrays;

public class EfficientWorkers {
    public static int findMinCost(int[] arr){
        int n = arr.length;
        if(n % 2 == 0){
            return -1;
        }
        Arrays.sort(arr);
        int prefix[] = new int[n + 1];
        int suffix[] = new int[n + 1];
        for(int i = 2; i <= n; i += 2){
            prefix[i] = prefix[i - 2] + (arr[i - 1] + arr[i - 2]);
        }
        for(int i = n - 2; i >= 0; i -= 2){
            suffix[i] = suffix[i + 2] + (arr[i + 1] + arr[i]);
        }
        for(int i = 0; i < n; i++){
            
        }
        return 1;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 8, 1, 9};
        int cost = findMinCost(arr);
        System.out.println("Minimum Cost - " + cost);
    }
}