/*
    You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.

    Input Format - First line contains number of test cases, T. Next T lines contains integers, n and k.
    Constraints -
        1<=T<=10
        1<=N<=10^15
        1<=K<=10^4
    Output Format - Output the integer x
    Sample Input -
        2
        10000 1
        1000000000000000 10
    Sample Output - 
        10000
        31
    Explanation - For the first test case, for x=10000, 10000^1=10000=n
*/

import java.util.Scanner;

public class Question11 {
    private static boolean isPowerWithinLimits(long base, int k, long limit){
        long product = 1;
        for(int i = 0; i < k; i++){
            if(product > limit / base){
                return false;
            }
            product *= base;
        }
        return true;
    }
    private static long findNearestKthRoot(long n, int k){
        if(k == 1){
            return n;
        }
        long lower = 1;
        long upper = n;
        long best = 1;
        while(lower <= upper){
            long mid = lower + (upper - lower) / 2;
            if(isPowerWithinLimits(mid, k, n)){
                best = mid;
                lower = mid + 1;
            }else{
                upper = mid - 1;
            }
        }
        return best;
    }
    public static void main(String args[]) {
        // Your Code Here
        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            while(T-- > 0){
                long n = sc.nextLong();
                int k = sc.nextInt();
                long result = findNearestKthRoot(n, k);
                System.out.println(result);
            }
        }
    }
}