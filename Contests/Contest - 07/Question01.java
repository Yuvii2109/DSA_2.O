/*
    Design a stack that supports push,pop,top,retrieving the minimum element in constant time.

    Input Format - First line of input contains integer n denoting the size of the string array. Next line of input contains n space separated string where i-th string represent i-th operation.(i.e, push,pop,top,getMin)

    Constraints - Functions pop, top and getMin operations will always be called on non-empty stacks.
    Output Format - Print the answer according to input operations.
    Sample Input - 
        7
        push push push getMin pop top getMin
        -2 0 -3
    Sample Output - -3 0 -2 
    Explanation - 
        push -2
        push 0
        push -3
        print -3 (getMin)
        pop -3
        print 0 (top)
        print -2 (getMin)
*/

import java.util.Scanner;
import java.util.Stack;

public class Question01 {
    private static final Stack<Integer> stack = new Stack<>();
    private static final Stack<Integer> minStack = new Stack<>();
    private static final StringBuilder out = new StringBuilder();

    private static void push(Scanner sc){
        int val = sc.nextInt(); 
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    private static void pop(){
        int v = stack.pop();
        if(!minStack.isEmpty() && v == minStack.peek()){
            minStack.pop();
        }
    }

    private static void top(){
        out.append(stack.peek()).append(" ");
    }

    private static void getMin(){
        out.append(minStack.peek()).append(" ");
    }

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            String[] commands = new String[n];
            for(int i = 0; i < n; i++){
                commands[i] = sc.next();
            }

            for(String comm : commands){
                switch(comm){
                    case "push" -> push(sc);
                    case "pop" -> pop();
                    case "top" -> top();
                    case "getMin" -> getMin();
                    default -> System.out.print("Battameezi Na Kar Bhai...");
                }
            }

            String s = out.toString().trim();
            if(!s.isEmpty()){
                System.out.print(s + " ");
            }
        }
    }
}