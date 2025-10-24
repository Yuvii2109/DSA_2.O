/*
    Implement a Queue using two stacks Make it Dequeue efficient.

    Input Format - Enter the size of the queue N add 0 - N-1 numbers in the queue
    Constraints - None    
    Output Format - Display the numbers in the order they are dequeued and in a space separated manner
        Sample Input - 5
        Sample Output - 0 1 2 3 4
*/

import java.util.Scanner;
import java.util.Stack;

public class Question16 {
    public static void dequeueUsingStacks(int n) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Enqueue elements into stack1
        for(int i = 0; i < n; i++){
            stack1.push(i);
        }

        // Dequeue elements from stack2
        for(int i = 0; i < n; i++){
            // If stack2 is empty, transfer elements from stack1 to stack2
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            // Pop from stack2
            if(!stack2.isEmpty()){
                System.out.print(stack2.pop() + " ");
            }
        }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            dequeueUsingStacks(n);
        }
    }
}