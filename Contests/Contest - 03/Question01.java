/*
    Sort just 0 and 1
    Input Format - A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space.
    Constraints - N will not exceed 10^7
    Output Format - Sorted Sequence
    Sample Input - 
        7
        1 0 0 1 1 0 1
    Sample Output - 0 0 0 1 1 1 1
*/

import java.util.Scanner;

public class Question01 {
    public static void sortZeroesOnes(int[] arr){
        int n = arr.length;
        int i = 0, j = n-1;
        while(i <= j){
            if(arr[i] == 0){
                i++;
            }else if(arr[j] == 1){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements you want in array - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            sortZeroesOnes(arr);
            System.out.println("Sorted array - ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}