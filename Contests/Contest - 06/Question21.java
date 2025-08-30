/*
    Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal. The rules of the game are as follows: Initially, there is an array, A , containing 'N' integers.

    In each move, Vivek must divide the array into two non-empty contiguous parts such that the sum of the elements in the left part is equal to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.

    After each successful move, Vivek have to discards either the left part or the right part and continues playing by using the remaining partition as array 'A'.

    Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the maximum number of points he can score?

    Input Format - First line of input contains an integer T denoting number of test cases. Each further Test case contains first line an integer 'N' , the size of array 'A'. After that 'N' space separated integers denoting the elements of array.
    Constraints - 1 <= T <= 10 1 <= N <= 28 0 <= A[i] <= 10^9
    Output Format - For each test case, print Vivek's maximum possible score on a new line.
    Sample Input -
        3
        3
        3 3 3
        4
        2 2 2 2
        7
        4 1 0 1 1 0 1
    Sample Output - 
        0
        2
        3
*/

import java.util.Scanner;

public class Question21 {
    public static int maxPoints(int[] arr, long sum, int l, int r){
        if(l >= r) return 0;
        if(sum == 0L) return r - l;
        if((sum & 1L) == 1L) return 0; 
        long leftSum = 0L;
        for(int k = l; k < r; k++){
            leftSum += arr[k];
            if(leftSum * 2L == sum){
                int leftAns  = maxPoints(arr, leftSum, l, k);
                int rightAns = maxPoints(arr, sum - leftSum, k + 1, r);
                return 1 + Math.max(leftAns, rightAns);
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            while(T-- > 0){
                int n = sc.nextInt();
                int arr[] = new int[n];
                long sum = 0;
                for(int i = 0; i < n; i++){
                    arr[i] = sc.nextInt();
                    sum += arr[i];
                }
                int result = maxPoints(arr, sum, 0, n-1);
                System.out.println(result);
            }
        }
    }
}