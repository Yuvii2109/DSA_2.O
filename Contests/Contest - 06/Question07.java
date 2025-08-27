/*
    Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns an array containing indices of all items in the array which have value equal to M. Print all the values in the returned array.

    Input Format - Enter a number N(size of the array) and add N more numbers to the array Enter number M to be searched in the array
    Constraints - 1 <= Size of array <= 10^5
    Output Format - Display all the indices at which number M is found in a space separated manner
    Sample Input - 
        5
        3
        2
        1
        2
        3
        2
    Sample Output - 1 3
    Explanation - 2 is found at indices 1 and 3.
*/

import java.util.Scanner;

public class Question07 {
    private static void printIndices(int[] arr, int i, int target, StringBuilder indices){
        if(i == arr.length){
            System.out.println(indices);
            return;
        }
        if(arr[i] == target){
            indices.append(i).append(" ");
        }
        printIndices(arr, i + 1, target, indices);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            int M = sc.nextInt();
            StringBuilder sb = new StringBuilder("");
            printIndices(arr, 0, M, sb);
        }
    }
}