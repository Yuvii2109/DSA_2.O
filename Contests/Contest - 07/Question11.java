
import java.util.Scanner;
import java.util.Stack;

/*
    Given an array of integers, for each element in the array, find the next greater element (NGE) in the array. The next greater element for an element x is the first element y to the right of x in the array such that y > x. If no such element exists, the NGE for that element is -1.

    Input Format - The first line contains an integer n, the size of the array. The second line contains n space-separated integers A[0], A[1], ..., A[n-1].
    Constraints - 
        1 ≤ n ≤ 106
        1 ≤ A[i] ≤ 109
    Output Format - Output a single line containing n space-separated integers, where each integer is the next greater element for the corresponding element in the input array. If no greater element exists, output -1.
    Sample Input - 
        4
        4 5 2 10
    Sample Output - 5 10 10 -1
    Explanation - 
        For the first element 4, the next greater element is 5.
        For the second element 5, the next greater element is 10.
        For the third element 2, the next greater element is 10.
        For the fourth element 10, there is no greater element to the right, so the output is -1.
*/

public class Question11 {
    public static void nextGreaterElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int val : nge){
            System.out.print(val + " ");
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            nextGreaterElement(arr);
        }
    }
}