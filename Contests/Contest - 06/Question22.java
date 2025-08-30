/*
    Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
        a. Write a recursive function which prints subsets of the array which sum to target.
        b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.
    Input Format - Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
    Constraints - None
    Output Format - Display the number of subsets and print the subsets in a space separated manner.
    Sample Input - 
        3
        1
        2
        3
        3
    Sample Output -
        1 2  3
        2
    Explanation - Add 2 spaces between 2 subset solutions
*/

import java.util.Scanner;

public class Question22 {
    private static int count = 0;
    private static void printSubset(int[] arr, int index, int target, String sub, int sum){
        if(index == arr.length){
            if(sum == target){
                System.out.print(sub + " ");
                count++;
            }
            return;
        }
        printSubset(arr, index + 1, target, sub + arr[index] + " ", sum + arr[index]);
        printSubset(arr, index + 1, target, sub, sum);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            count = 0;
            printSubset(arr, 0, target, "", 0);
            System.out.println("\n" + count);
        }
    }
}