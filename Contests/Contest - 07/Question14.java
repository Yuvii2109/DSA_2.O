import java.util.Scanner;
import java.util.Stack;

/*
    The stock span problem is a financial problem where we have a series of N daily price quotes for a stock and we need to calculate span of stock’s price for all N days. You are given an array of length N, where ith element of array denotes the price of a stock on ith. Find the span of stock's price on ith day, for every 1<=i<=N.

    A span of a stock's price on a given day, i, is the maximum number of consecutive days before the (i+1)th day, for which stock's price on these days is less than or equal to that on the ith day.

    Input Format - First line contains integer N denoting size of the array. Next line contains N space separated integers denoting the elements of the array.
    Constraints - 1 <= N <= 10^6
    Output Format - Display the array containing stock span values.
    Sample Input - 
        5
        30
        35
        40
        38
        35
    Sample Output - 1 2 3 1 1 END
    Explanation - 
        For the given case
        for day1 stock span = 1
        for day2 stock span = 2 (as 35 > 30 so both days are included in it)
        for day3 stock span = 3 (as 40 > 35 so 2+1=3)
        for day4 stock span = 1 (as 38 < 40 so only that day is included)
        for day5 stock span = 1 (as 35 < 38 so only that day is included)
        hence output is 1 2 3 1 1 END
*/

public class Question14 {
    public static void calculateStockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            // Pop elements from stack while stack is not empty and top of stack is less than or equal to current price
            while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]){
                stack.pop();
            }

            // If stack is empty, it means all previous prices are less than current price
            if(stack.isEmpty()){
                span[i] = i + 1;
            }else{
                span[i] = i - stack.peek();
            }

            // Push current index onto stack
            stack.push(i);
        }

        // Print the span values
        for(int val : span){
            System.out.print(val + " ");
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] prices = new int[n];
            for(int i = 0; i < n; i++){
                prices[i] = sc.nextInt();
            }
            calculateStockSpan(prices);
        }
    }
}