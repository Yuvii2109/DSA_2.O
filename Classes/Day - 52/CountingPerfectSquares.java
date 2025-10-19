import java.util.Map;
import java.util.Scanner;

/*
    There exists an array with integers we have to find how many pairs on being multiplied are forming a perfect square. 

    Example - 

    Input - arr = [1, 1, 4, 2, 2]
    Output - 4
    Explanation - The pairs are (1, 1), (1, 4), (1, 4), (2, 2) which forms perfect squares 1, 4, 4, 4 respectively.
*/

public class CountingPerfectSquares {
    // Naive Approach - O(N^2)
    public static boolean isPerfectSquare(int num){
        if(num < 0) return false;
        int sqrt = (int)Math.sqrt(num);
        return (sqrt * sqrt == num);
    }
    public static void printCountOfPerfectSquarePairs(int[] arr){
        int count = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(isPerfectSquare(arr[i] * arr[j])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    // Optimized Approach - O(N * log(max(arr)))
    public static void primeFactorization(int num, Map<Integer, Integer> primeCountMap){
        for(int i = 2; i * i <= num; i++){
            while(num % i == 0){
                primeCountMap.put(i, primeCountMap.getOrDefault(i, 0) + 1);
                num /= i;
            }
        }
        if(num > 1){
            primeCountMap.put(num, primeCountMap.getOrDefault(num, 0) + 1);
        }
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            printCountOfPerfectSquarePairs(arr);
        }
    }
}