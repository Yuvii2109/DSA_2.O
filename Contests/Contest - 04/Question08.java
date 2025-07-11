/*
    You are provided an array of numbers. You need to arrange them in a way that yields the largest value.

    Input Format - First line contains integer t which is number of test case. For each test case, you are given a single integer n in the first line which is the size of array A[] and next line contains n space separated integers denoting the elements of the array A .
    Constraints - 
        1<=t<=100
        1<=m<=100
        1<=A[i]<=10^5
    Output Format - Print the largest value. 
    Sample Input - 
        1
        4
        54 546 548 60
    Sample Output - 6054854654
    Explanation - Upon rearranging the elements of the array , 6054854654 is the largest possible number that can be generated.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Question08 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            while(T-- > 0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i = 0; i < n; i++){
                    arr[i] = sc.nextInt();
                }
                String nums[] = new String[n];
                for(int i = 0; i < n; i++){
                    nums[i] = String.valueOf(arr[i]);
                }
                Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));
                if(nums[0].equals("0")){
                    System.out.println("0");
                }else{
                    StringBuilder result = new StringBuilder();
                    for(String num : nums){
                        result.append(num);
                    }
                    String output = result.toString();
                    System.out.println(output);
                }
            }
        }
    }
}