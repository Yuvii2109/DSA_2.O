/*
    Take as input N, a number. Take N more inputs and store that in an array.
        a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.
        b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.
    Input Format - Take as input N, a number. Take N more inputs and store that in an array.
    Constraints - None
    Output Format - Display all the groups in a comma separated manner and display the number of ways the array can be split
    Sample Input - 
        6
        1
        2
        3
        3
        4
        5
    Sample Output - 
        1 2 3 3 and 4 5 
        1 3 5 and 2 3 4 
        1 3 5 and 2 3 4 
        2 3 4 and 1 3 5 
        2 3 4 and 1 3 5 
        4 5 and 1 2 3 3 
        6
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question11 {
    public static int splitCountAndPrint(int[] arr, int index, List<Integer> g1, List<Integer> g2, int sum1, int sum2){
        if(index == arr.length){
            if(sum1 == sum2){
                for(int x : g1) System.out.print(x + " ");
                System.out.print("and ");
                for(int x : g2) System.out.print(x + " ");
                System.out.println();
                return 1;
            }
            return 0;
        }
        g1.add(arr[index]);
        int count = splitCountAndPrint(arr, index + 1, g1, g2, sum1 + arr[index], sum2);
        g1.remove(g1.size() - 1);

        g2.add(arr[index]);
        count += splitCountAndPrint(arr, index + 1, g1, g2, sum1, sum2 + arr[index]);
        g2.remove(g2.size() - 1);
        return count;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int totalWays = splitCountAndPrint(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
            System.out.println(totalWays);
        }
    }
}