import java.util.Scanner;
import java.util.Stack;

/*
    We are given a circular array, print the next greater number for every element. If it is not found print -1 for that number. To find the next greater number for element Ai , start from index i + 1 and go uptil the last index after which we start looking for the greater number from the starting index of the array since array is circular.

    Input Format - First line contains the length of the array n. Second line contains the n space separated integers.
    Constraints -
        1 <= n <= 10^6
        -10^8 <= Ai <= 10^8 , 0<= i< n
    Output Format - Print n space separated integers each representing the next greater element.
    Sample Input - 
        3
        1 2 3
    Sample Output - 2 3 -1
    Explanation - Next greater element for 1 is 2, for 2 is 3 but not present for 3 therefore -1
*/

public class Question10 {
    public static void findGreaterElement(int[] arr) {
        int n = arr.length;
        int[] fge = new int[n];
        Stack<Integer> stack = new Stack<>();

        // We will traverse the array twice to simulate the circular nature
        for(int i = 2 * n - 1; i >= 0; i--){
            int index = i % n;

            // Pop elements from stack which are less than or equal to current element
            while(!stack.isEmpty() && stack.peek() <= arr[index]){
                stack.pop();
            }

            // If stack is empty, no greater element found
            if(stack.isEmpty()){
                fge[index] = -1;
            }else{
                fge[index] = stack.peek();
            }

            // Push current element onto stack
            stack.push(arr[index]);
        }

        // Print the next greater elements
        for(int val : fge){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            findGreaterElement(arr);
        }
    }
}