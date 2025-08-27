/*
    Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the first index at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

    Input Format - Enter a number N and add N more elements to an array, then enter a number M
    Constraints - None
    Output Format - Display the first index at which number M is found
    Sample Input - 
        5
        3
        2
        1
        2
        2
        2
    Sample Output - 1
*/

import java.util.Scanner;

public class Question06 {
    private static int findFirst(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }else if(arr[i] == target){
            return i;
        }
        return findFirst(arr, i + 1, target);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            int M = sc.nextInt();
            System.out.println(findFirst(arr, 0, M));
        }
    }
}