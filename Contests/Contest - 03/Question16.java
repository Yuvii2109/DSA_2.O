/*
    Design a program to find the majority element in an array. A majority element in an array is an element that appears more than n/2 times, where n is the size of the array. If no such element exists, return -1.
    Input Format - The first line contains an integer n, the size of the array. The second line contains n space-separated integers representing the elements of the array.
    Constraints - 
        1 ≤ n ≤ 105
        1 ≤ arr[i] ≤ 105
    Output Format - Output a single integer -
        The majority element if it exists.
        -1 if there is no majority element.
    Sample Input - 
        5
        2 2 1 1 2
    Sample Output - 2
    Explanation - Array - [2, 2, 1, 1, 2], The element 2 appears 3 times, which is more than 5/2 = 2.5. Thus, 2 is the majority element.
*/

import java.util.HashMap;
import java.util.Scanner;

public class Question16 {
    public static int checkMajority(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > arr.length/2){
                return key;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int result = checkMajority(arr);
            System.out.print(result);
        }
    }
}