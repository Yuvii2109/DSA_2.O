/*
    Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the last index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

    Input Format - Enter a number N and add N more numbers to an array, then enter number M to be searched
    Constraints - None
    Output Format - Display the last index at which the number M is found
    Sample Input - 
        5
        3
        2
        1
        2
        3
        2
    Sample Output - 3
*/

import java.util.Scanner;

public class Question04 {
    private static int lastIdx = -1;
    private static void findLast(int[] arr, int i, int k){
        if(i == arr.length){
            System.out.println(lastIdx);
            return;
        }
        if(arr[i] == k){
            lastIdx = i;
        }
        findLast(arr, i + 1, k);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            int M = sc.nextInt();
            lastIdx = -1;
            findLast(arr, 0, M);
        }
    }
}